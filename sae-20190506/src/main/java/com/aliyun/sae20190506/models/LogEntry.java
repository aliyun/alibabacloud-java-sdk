// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class LogEntry extends TeaModel {
    @NameInMap("instanceID")
    public String instanceID;

    @NameInMap("message")
    public String message;

    @NameInMap("offset")
    public Long offset;

    @NameInMap("packID")
    public String packID;

    @NameInMap("packMeta")
    public String packMeta;

    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("timestamp")
    public Integer timestamp;

    @NameInMap("versionID")
    public String versionID;

    public static LogEntry build(java.util.Map<String, ?> map) throws Exception {
        LogEntry self = new LogEntry();
        return TeaModel.build(map, self);
    }

    public LogEntry setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

    public LogEntry setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LogEntry setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public LogEntry setPackID(String packID) {
        this.packID = packID;
        return this;
    }
    public String getPackID() {
        return this.packID;
    }

    public LogEntry setPackMeta(String packMeta) {
        this.packMeta = packMeta;
        return this;
    }
    public String getPackMeta() {
        return this.packMeta;
    }

    public LogEntry setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public LogEntry setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Integer getTimestamp() {
        return this.timestamp;
    }

    public LogEntry setVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    public String getVersionID() {
        return this.versionID;
    }

}
