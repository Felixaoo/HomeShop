package com.felixaoo;

public interface Writer {
    /**
     * start writing process
     */
    public void start();

    /**
     * Write on line
     * @param line
     */
    public void writeLine(String line);

    /**
     * Stop writing process
     */
    public void stop();
}
