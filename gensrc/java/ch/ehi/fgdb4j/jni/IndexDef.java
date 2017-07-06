/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ch.ehi.fgdb4j.jni;

public class IndexDef {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IndexDef(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexDef obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        fgbd4jJNI.delete_IndexDef(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IndexDef() {
    this(fgbd4jJNI.new_IndexDef__SWIG_0(), true);
  }

  public IndexDef(String name, String fields, boolean isUnique) {
    this(fgbd4jJNI.new_IndexDef__SWIG_1(name, fields, isUnique), true);
  }

  public IndexDef(String name, String fields) {
    this(fgbd4jJNI.new_IndexDef__SWIG_2(name, fields), true);
  }

  public int GetName(StringBuffer name) {
    return fgbd4jJNI.IndexDef_GetName(swigCPtr, this, name);
  }

  public int SetName(String name) {
    return fgbd4jJNI.IndexDef_SetName(swigCPtr, this, name);
  }

  public int GetFields(StringBuffer fields) {
    return fgbd4jJNI.IndexDef_GetFields(swigCPtr, this, fields);
  }

  public int SetFields(String fields) {
    return fgbd4jJNI.IndexDef_SetFields(swigCPtr, this, fields);
  }

  public int GetIsUnique(boolean[] isUnique) {
    return fgbd4jJNI.IndexDef_GetIsUnique(swigCPtr, this, isUnique);
  }

  public int SetIsUnique(boolean isUnique) {
    return fgbd4jJNI.IndexDef_SetIsUnique(swigCPtr, this, isUnique);
  }

}