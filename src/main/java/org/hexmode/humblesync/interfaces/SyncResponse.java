package org.hexmode.humblesync.interfaces;

public interface SyncResponse<T> {
    String getVersion();
    T getPayload();
    void setPayload(T payload);
}
