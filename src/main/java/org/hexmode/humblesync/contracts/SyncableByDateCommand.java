package org.hexmode.humblesync.contracts;

import org.hexmode.humblesync.interfaces.SyncCommand;
import org.hexmode.humblesync.interfaces.SyncableByDate;

import java.util.Date;
import java.util.UUID;

public class SyncableByDateCommand implements SyncableByDate, SyncCommand {
    private UUID uuid;
    private String command;
    private Date lastModified;

    @Override
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public String getCommand() {
        return command;
    }

    @Override
    public Date getLastModified() {
        return lastModified;
    }
}
