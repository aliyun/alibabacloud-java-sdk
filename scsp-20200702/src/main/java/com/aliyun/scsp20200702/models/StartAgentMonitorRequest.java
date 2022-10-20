// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class StartAgentMonitorRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("CallId")
    public String callId;

    @NameInMap("CallerParentId")
    public Long callerParentId;

    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("CallerUid")
    public Long callerUid;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionId")
    public String connectionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StsTokenCallerUid")
    public Long stsTokenCallerUid;

    public static StartAgentMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAgentMonitorRequest self = new StartAgentMonitorRequest();
        return TeaModel.build(map, self);
    }

    public StartAgentMonitorRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public StartAgentMonitorRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public StartAgentMonitorRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public StartAgentMonitorRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public StartAgentMonitorRequest setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

    public StartAgentMonitorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartAgentMonitorRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public StartAgentMonitorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartAgentMonitorRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public StartAgentMonitorRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartAgentMonitorRequest setStsTokenCallerUid(Long stsTokenCallerUid) {
        this.stsTokenCallerUid = stsTokenCallerUid;
        return this;
    }
    public Long getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

}
