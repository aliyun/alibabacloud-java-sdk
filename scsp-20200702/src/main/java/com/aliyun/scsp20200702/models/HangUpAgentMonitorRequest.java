// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class HangUpAgentMonitorRequest extends TeaModel {
    // AccountName
    @NameInMap("AccountName")
    public String accountName;

    // CallId
    @NameInMap("CallId")
    public String callId;

    // callerParentId
    @NameInMap("CallerParentId")
    public Long callerParentId;

    // callerType
    @NameInMap("CallerType")
    public String callerType;

    // callerUid
    @NameInMap("CallerUid")
    public Long callerUid;

    // clientToken
    @NameInMap("ClientToken")
    public String clientToken;

    // ConnectionId
    @NameInMap("ConnectionId")
    public String connectionId;

    // InstanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // JobId
    @NameInMap("JobId")
    public String jobId;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // stsTokenCallerUid
    @NameInMap("StsTokenCallerUid")
    public Long stsTokenCallerUid;

    public static HangUpAgentMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        HangUpAgentMonitorRequest self = new HangUpAgentMonitorRequest();
        return TeaModel.build(map, self);
    }

    public HangUpAgentMonitorRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public HangUpAgentMonitorRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public HangUpAgentMonitorRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public HangUpAgentMonitorRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public HangUpAgentMonitorRequest setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

    public HangUpAgentMonitorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public HangUpAgentMonitorRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public HangUpAgentMonitorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public HangUpAgentMonitorRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public HangUpAgentMonitorRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HangUpAgentMonitorRequest setStsTokenCallerUid(Long stsTokenCallerUid) {
        this.stsTokenCallerUid = stsTokenCallerUid;
        return this;
    }
    public Long getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

}
