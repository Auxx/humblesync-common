package org.hexmode.humblesync.interfaces;

public interface SyncRequest<T> {
    String getVersion();
    String getStrategy();
    T getPayload();
    void setPayload(T payload);
}
