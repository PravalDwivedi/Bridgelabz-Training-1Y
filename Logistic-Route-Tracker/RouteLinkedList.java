class RouteLinkedList<T extends Checkpoint> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;


    public void addCheckpoint(T checkpoint) {
        Node newNode = new Node(checkpoint);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean removeCheckpoint(String id) {
        if (head == null) return false;

        if (head.data.getId().equals(id)) {
            head = head.next;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.getId().equals(id)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    public T findCheckpoint(String id) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getId().equals(id)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.data.distanceFromLast;
            temp = temp.next;
        }
        return total;
    }


    public double computeTotalPenalty() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return total;
    }


    public void printRoute() {
        Node temp = head;
        int i = 1;

        while (temp != null) {
            T cp = temp.data;

            String status = cp.isDelayed() ? "Delayed" : "On Time";
            System.out.println(i + ". " + cp.getType() + " – " + cp.locationName
                    + " – " + status + " – Penalty: " + cp.calculatePenalty());

            temp = temp.next;
            i++;
        }
    }


    public boolean checkConsistency() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node temp = head;
        while (temp != null) {
            if (temp.data.getType().contains("Delivery"))
                hasDelivery = true;

            if (temp.data.getType().contains("Fuel"))
                hasFuel = true;

            temp = temp.next;
        }

        return hasDelivery && hasFuel;
    }
}