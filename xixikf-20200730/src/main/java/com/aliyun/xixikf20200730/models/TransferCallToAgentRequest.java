// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class TransferCallToAgentRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("CallId")
    public String callId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionId")
    public String connectionId;

    @NameInMap("HoldConnectionId")
    public String holdConnectionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsSingleTransfer")
    public String isSingleTransfer;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("TargetAccountName")
    public String targetAccountName;

    @NameInMap("Type")
    public Integer type;

    public static TransferCallToAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferCallToAgentRequest self = new TransferCallToAgentRequest();
        return TeaModel.build(map, self);
    }

    public TransferCallToAgentRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public TransferCallToAgentRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public TransferCallToAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TransferCallToAgentRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public TransferCallToAgentRequest setHoldConnectionId(String holdConnectionId) {
        this.holdConnectionId = holdConnectionId;
        return this;
    }
    public String getHoldConnectionId() {
        return this.holdConnectionId;
    }

    public TransferCallToAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TransferCallToAgentRequest setIsSingleTransfer(String isSingleTransfer) {
        this.isSingleTransfer = isSingleTransfer;
        return this;
    }
    public String getIsSingleTransfer() {
        return this.isSingleTransfer;
    }

    public TransferCallToAgentRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public TransferCallToAgentRequest setTargetAccountName(String targetAccountName) {
        this.targetAccountName = targetAccountName;
        return this;
    }
    public String getTargetAccountName() {
        return this.targetAccountName;
    }

    public TransferCallToAgentRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
