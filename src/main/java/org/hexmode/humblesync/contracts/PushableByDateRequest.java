package org.hexmode.humblesync.contracts;

import org.hexmode.humblesync.interfaces.SyncRequest;
import org.hexmode.humblesync.interfaces.SyncableByDate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PushableByDateRequest implements SyncRequest<Map<String, SyncableByDate[]>> {
    private String version = ContractVersions.V1_0;
    private String strategy = SyncStrategies.PUSH_BY_DATE;
    private Map<String, SyncableByDate[]> payload = new HashMap<>();

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public String getStrategy() {
        return strategy;
    }

    @Override
    public Map<String, SyncableByDate[]> getPayload() {
        return payload;
    }

    @Override
    public void setPayload(Map<String, SyncableByDate[]> payload) {
        this.payload = payload;
    }

    public PushableByDateRequest setEntity(String name, SyncableByDate[] items) {
        payload.put(name, items);
        return this;
    }

    public PushableByDateRequest setEntity(String name, List<SyncableByDate> items) {
        payload.put(name, items.toArray(new SyncableByDate[0]));
        return this;
    }

    public SyncableByDate[] getEntity(String name) {
        return payload.get(name);
    }
}
