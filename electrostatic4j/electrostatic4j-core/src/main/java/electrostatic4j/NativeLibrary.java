/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package electrostatic4j;

import electrostatic4j.util.loader.NativeImageLoader;

public class NativeLibrary {
    
    /*
     * Static initializer: Loads the native image when this object is created or referenced.
    */
    static {
        NativeImageLoader.loadLibrary();
    }
    
    protected NativeLibrary() {
    }
    
    public static native int open(String device);
}
