// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetPerRequestLogsInput extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("errorType")
    public String errorType;

    @NameInMap("forwardLine")
    public Long forwardLine;

    @NameInMap("instanceID")
    public String instanceID;

    @NameInMap("isColdStart")
    public Boolean isColdStart;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("requestID")
    public String requestID;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("timestamp")
    public String timestamp;

    public static GetPerRequestLogsInput build(java.util.Map<String, ?> map) throws Exception {
        GetPerRequestLogsInput self = new GetPerRequestLogsInput();
        return TeaModel.build(map, self);
    }

    public GetPerRequestLogsInput setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetPerRequestLogsInput setErrorType(String errorType) {
        this.errorType = errorType;
        return this;
    }
    public String getErrorType() {
        return this.errorType;
    }

    public GetPerRequestLogsInput setForwardLine(Long forwardLine) {
        this.forwardLine = forwardLine;
        return this;
    }
    public Long getForwardLine() {
        return this.forwardLine;
    }

    public GetPerRequestLogsInput setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

    public GetPerRequestLogsInput setIsColdStart(Boolean isColdStart) {
        this.isColdStart = isColdStart;
        return this;
    }
    public Boolean getIsColdStart() {
        return this.isColdStart;
    }

    public GetPerRequestLogsInput setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public GetPerRequestLogsInput setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetPerRequestLogsInput setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
