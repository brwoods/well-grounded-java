// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1 {

    static final FunctionDescriptor getiopolicy_np$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle getiopolicy_np$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "getiopolicy_np",
        "(II)I",
        constants$1.getiopolicy_np$FUNC, false
    );
    static final FunctionDescriptor getrlimit$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle getrlimit$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "getrlimit",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1.getrlimit$FUNC, false
    );
    static final FunctionDescriptor getrusage$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle getrusage$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "getrusage",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1.getrusage$FUNC, false
    );
    static final FunctionDescriptor setpriority$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle setpriority$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "setpriority",
        "(III)I",
        constants$1.setpriority$FUNC, false
    );
    static final FunctionDescriptor setiopolicy_np$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle setiopolicy_np$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "setiopolicy_np",
        "(III)I",
        constants$1.setiopolicy_np$FUNC, false
    );
    static final FunctionDescriptor setrlimit$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle setrlimit$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "setrlimit",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1.setrlimit$FUNC, false
    );
}

