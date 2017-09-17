package org.hexmode.humblesync.interfaces;

import java.util.Date;

public interface SyncableByDate extends BaseSyncable {
    Date getLastModified();
}
