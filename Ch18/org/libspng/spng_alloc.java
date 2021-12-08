// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class spng_alloc {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("malloc_fn"),
        C_POINTER.withName("realloc_fn"),
        C_POINTER.withName("calloc_fn"),
        C_POINTER.withName("free_fn")
    ).withName("spng_alloc");
    public static MemoryLayout $LAYOUT() {
        return spng_alloc.$struct$LAYOUT;
    }
    static final VarHandle malloc_fn$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("malloc_fn")));
    public static VarHandle malloc_fn$VH() {
        return spng_alloc.malloc_fn$VH;
    }
    public static MemoryAddress malloc_fn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)spng_alloc.malloc_fn$VH.get(seg);
    }
    public static void malloc_fn$set( MemorySegment seg, MemoryAddress x) {
        spng_alloc.malloc_fn$VH.set(seg, x);
    }
    public static MemoryAddress malloc_fn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)spng_alloc.malloc_fn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void malloc_fn$set(MemorySegment seg, long index, MemoryAddress x) {
        spng_alloc.malloc_fn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle realloc_fn$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("realloc_fn")));
    public static VarHandle realloc_fn$VH() {
        return spng_alloc.realloc_fn$VH;
    }
    public static MemoryAddress realloc_fn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)spng_alloc.realloc_fn$VH.get(seg);
    }
    public static void realloc_fn$set( MemorySegment seg, MemoryAddress x) {
        spng_alloc.realloc_fn$VH.set(seg, x);
    }
    public static MemoryAddress realloc_fn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)spng_alloc.realloc_fn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void realloc_fn$set(MemorySegment seg, long index, MemoryAddress x) {
        spng_alloc.realloc_fn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle calloc_fn$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("calloc_fn")));
    public static VarHandle calloc_fn$VH() {
        return spng_alloc.calloc_fn$VH;
    }
    public static MemoryAddress calloc_fn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)spng_alloc.calloc_fn$VH.get(seg);
    }
    public static void calloc_fn$set( MemorySegment seg, MemoryAddress x) {
        spng_alloc.calloc_fn$VH.set(seg, x);
    }
    public static MemoryAddress calloc_fn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)spng_alloc.calloc_fn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void calloc_fn$set(MemorySegment seg, long index, MemoryAddress x) {
        spng_alloc.calloc_fn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle free_fn$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("free_fn")));
    public static VarHandle free_fn$VH() {
        return spng_alloc.free_fn$VH;
    }
    public static MemoryAddress free_fn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)spng_alloc.free_fn$VH.get(seg);
    }
    public static void free_fn$set( MemorySegment seg, MemoryAddress x) {
        spng_alloc.free_fn$VH.set(seg, x);
    }
    public static MemoryAddress free_fn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)spng_alloc.free_fn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void free_fn$set(MemorySegment seg, long index, MemoryAddress x) {
        spng_alloc.free_fn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

