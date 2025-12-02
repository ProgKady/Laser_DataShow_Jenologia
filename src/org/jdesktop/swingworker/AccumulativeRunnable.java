

package org.jdesktop.swingworker;

import java.util.*;
import javax.swing.SwingUtilities;

abstract class AccumulativeRunnable<T> implements Runnable {
    private List<T> arguments = null;
    
    /**
     * Equivalent to {@code Runnable.run} method with the
     * accumulated arguments to process.
     *
     * @param args accumulated arguments to process.
     */
    protected abstract void run(List<T> args);
    
    /**
     * {@inheritDoc}
     *
     * <p>
     * This implementation calls {@code run(List<T> args)} method
     * with the list of accumulated arguments.
     */
    public final void run() {
        run(flush());
    }
    
    /**
     * prepends or appends arguments and sends this {@code Runnable} for the 
     * execution if needed.
     * <p>
     * This implementation uses {@see #submit} to send this 
     * {@code Runnable} for execution.
     * @param isPrepend prepend or append 
     * @param args the arguments to add  
     */
    public final synchronized void add(boolean isPrepend, T... args) {
        boolean isSubmitted = true;
        if (arguments == null) {
            isSubmitted = false;
            arguments = new ArrayList<T>();
        }
        if (isPrepend) { 
            arguments.addAll(0, Arrays.asList(args)); 
        } else { 
            Collections.addAll(arguments, args); 
        } 
        if (!isSubmitted) {
            submit();
        }
    }

    /**
     * appends arguments and sends this {@code Runnable} for the
     * execution if needed.
     * <p>
     * This implementation uses {@see #submit} to send this 
     * {@code Runnable} for execution. 
     * @param args the arguments to accumulate
     */
    public final void add(T... args) {
        add(false, args);
    }
    
    /**
     * Sends this {@code Runnable} for the execution
     *
     * <p>
     * This method is to be executed only from {@code add} method.
     *
     * <p>
     * This implementation uses {@code SwingWorker.invokeLater}.
     */
    protected void submit() {
        SwingUtilities.invokeLater(this);
    }
        
    /**
     * Returns accumulated arguments and flashes the arguments storage.
     *
     * @return accumulated arguments
     */
    private final synchronized List<T> flush() {
        List<T> list = arguments;
        arguments = null;
        return list;
    }
}

