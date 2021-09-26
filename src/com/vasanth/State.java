package com.vasanth;

public class State {
    private PrinterType nextToPrint;

    public PrinterType getNextToPrint() {
        return nextToPrint;
    }

    public void setNextToPrint(PrinterType nextToPrint) {
        this.nextToPrint = nextToPrint;
    }

    public State(final PrinterType nextToPrint) {
        this.nextToPrint = nextToPrint;
    }
}
