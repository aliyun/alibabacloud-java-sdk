// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetInstanceLogsInput extends TeaModel {
    @NameInMap("backwardLine")
    public Long backwardLine;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("forwardLine")
    public Long forwardLine;

    @NameInMap("isTail")
    public Boolean isTail;

    @NameInMap("match")
    public String match;

    @NameInMap("message")
    public String message;

    @NameInMap("offset")
    public Long offset;

    @NameInMap("packID")
    public String packID;

    @NameInMap("packMeta")
    public String packMeta;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("timestamp")
    public String timestamp;

    @NameInMap("versionID")
    public String versionID;

    public static GetInstanceLogsInput build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLogsInput self = new GetInstanceLogsInput();
        return TeaModel.build(map, self);
    }

    public GetInstanceLogsInput setBackwardLine(Long backwardLine) {
        this.backwardLine = backwardLine;
        return this;
    }
    public Long getBackwardLine() {
        return this.backwardLine;
    }

    public GetInstanceLogsInput setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetInstanceLogsInput setForwardLine(Long forwardLine) {
        this.forwardLine = forwardLine;
        return this;
    }
    public Long getForwardLine() {
        return this.forwardLine;
    }

    public GetInstanceLogsInput setIsTail(Boolean isTail) {
        this.isTail = isTail;
        return this;
    }
    public Boolean getIsTail() {
        return this.isTail;
    }

    public GetInstanceLogsInput setMatch(String match) {
        this.match = match;
        return this;
    }
    public String getMatch() {
        return this.match;
    }

    public GetInstanceLogsInput setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceLogsInput setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public GetInstanceLogsInput setPackID(String packID) {
        this.packID = packID;
        return this;
    }
    public String getPackID() {
        return this.packID;
    }

    public GetInstanceLogsInput setPackMeta(String packMeta) {
        this.packMeta = packMeta;
        return this;
    }
    public String getPackMeta() {
        return this.packMeta;
    }

    public GetInstanceLogsInput setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetInstanceLogsInput setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public GetInstanceLogsInput setVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    public String getVersionID() {
        return this.versionID;
    }

}
