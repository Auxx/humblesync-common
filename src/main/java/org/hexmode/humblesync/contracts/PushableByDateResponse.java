package org.hexmode.humblesync.contracts;

import org.hexmode.humblesync.interfaces.SyncResponse;
import org.hexmode.humblesync.interfaces.SyncableByDate;

import java.util.HashMap;
import java.util.Map;

public class PushableByDateResponse implements SyncResponse<Map<String, SyncableByDate[]>> {
    private String version = ContractVersions.V1_0;
    private Map<String, SyncableByDate[]> payload = new HashMap<>();

    @Override
    public String getVersion() {
        return null;
    }

    @Override
    public Map<String, SyncableByDate[]> getPayload() {
        return null;
    }

    @Override
    public void setPayload(Map<String, SyncableByDate[]> payload) {

    }
}
