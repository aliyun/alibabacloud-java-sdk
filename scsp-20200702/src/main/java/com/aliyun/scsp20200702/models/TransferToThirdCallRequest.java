// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class TransferToThirdCallRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("CallId")
    public String callId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("ConnectionId")
    public String connectionId;

    @NameInMap("HoldConnectionId")
    public String holdConnectionId;

    public static TransferToThirdCallRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferToThirdCallRequest self = new TransferToThirdCallRequest();
        return TeaModel.build(map, self);
    }

    public TransferToThirdCallRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TransferToThirdCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TransferToThirdCallRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public TransferToThirdCallRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public TransferToThirdCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public TransferToThirdCallRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public TransferToThirdCallRequest setHoldConnectionId(String holdConnectionId) {
        this.holdConnectionId = holdConnectionId;
        return this;
    }
    public String getHoldConnectionId() {
        return this.holdConnectionId;
    }

}
