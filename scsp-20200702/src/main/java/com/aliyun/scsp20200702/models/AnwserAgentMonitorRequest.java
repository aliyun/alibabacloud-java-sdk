// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class AnwserAgentMonitorRequest extends TeaModel {
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

    public static AnwserAgentMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        AnwserAgentMonitorRequest self = new AnwserAgentMonitorRequest();
        return TeaModel.build(map, self);
    }

    public AnwserAgentMonitorRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public AnwserAgentMonitorRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public AnwserAgentMonitorRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public AnwserAgentMonitorRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public AnwserAgentMonitorRequest setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

    public AnwserAgentMonitorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AnwserAgentMonitorRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public AnwserAgentMonitorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AnwserAgentMonitorRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public AnwserAgentMonitorRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AnwserAgentMonitorRequest setStsTokenCallerUid(Long stsTokenCallerUid) {
        this.stsTokenCallerUid = stsTokenCallerUid;
        return this;
    }
    public Long getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

}
