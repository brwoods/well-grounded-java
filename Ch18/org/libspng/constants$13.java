// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$13 {

    static final FunctionDescriptor lrand48$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle lrand48$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "lrand48",
        "()J",
        constants$13.lrand48$FUNC, false
    );
    static final FunctionDescriptor mktemp$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle mktemp$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "mktemp",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$13.mktemp$FUNC, false
    );
    static final FunctionDescriptor mkstemp$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle mkstemp$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "mkstemp",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$13.mkstemp$FUNC, false
    );
    static final FunctionDescriptor mrand48$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle mrand48$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "mrand48",
        "()J",
        constants$13.mrand48$FUNC, false
    );
    static final FunctionDescriptor nrand48$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle nrand48$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "nrand48",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$13.nrand48$FUNC, false
    );
    static final FunctionDescriptor posix_openpt$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle posix_openpt$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "posix_openpt",
        "(I)I",
        constants$13.posix_openpt$FUNC, false
    );
}

