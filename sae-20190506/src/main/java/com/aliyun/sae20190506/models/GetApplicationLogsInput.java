// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetApplicationLogsInput extends TeaModel {
    @NameInMap("backwardLine")
    public Long backwardLine;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("forwardLine")
    public Long forwardLine;

    @NameInMap("instanceID")
    public String instanceID;

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

    public static GetApplicationLogsInput build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationLogsInput self = new GetApplicationLogsInput();
        return TeaModel.build(map, self);
    }

    public GetApplicationLogsInput setBackwardLine(Long backwardLine) {
        this.backwardLine = backwardLine;
        return this;
    }
    public Long getBackwardLine() {
        return this.backwardLine;
    }

    public GetApplicationLogsInput setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetApplicationLogsInput setForwardLine(Long forwardLine) {
        this.forwardLine = forwardLine;
        return this;
    }
    public Long getForwardLine() {
        return this.forwardLine;
    }

    public GetApplicationLogsInput setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

    public GetApplicationLogsInput setIsTail(Boolean isTail) {
        this.isTail = isTail;
        return this;
    }
    public Boolean getIsTail() {
        return this.isTail;
    }

    public GetApplicationLogsInput setMatch(String match) {
        this.match = match;
        return this;
    }
    public String getMatch() {
        return this.match;
    }

    public GetApplicationLogsInput setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApplicationLogsInput setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public GetApplicationLogsInput setPackID(String packID) {
        this.packID = packID;
        return this;
    }
    public String getPackID() {
        return this.packID;
    }

    public GetApplicationLogsInput setPackMeta(String packMeta) {
        this.packMeta = packMeta;
        return this;
    }
    public String getPackMeta() {
        return this.packMeta;
    }

    public GetApplicationLogsInput setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetApplicationLogsInput setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public GetApplicationLogsInput setVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    public String getVersionID() {
        return this.versionID;
    }

}
