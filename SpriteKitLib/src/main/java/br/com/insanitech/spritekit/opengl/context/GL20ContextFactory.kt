package br.com.insanitech.spritekit.opengl.context

import javax.microedition.khronos.egl.EGL10
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.egl.EGLContext
import javax.microedition.khronos.egl.EGLDisplay

/**
 * Created by anderson on 6/30/15.
 */
open class GL20ContextFactory : GL11ContextFactory() {
    override fun createContext(egl: EGL10, display: EGLDisplay, eglConfig: EGLConfig): EGLContext? {
        glVersion = GLVersion.GL20
        val context = createGLContext(egl, display, eglConfig)
        return context ?: super.createContext(egl, display, eglConfig)
    }
}