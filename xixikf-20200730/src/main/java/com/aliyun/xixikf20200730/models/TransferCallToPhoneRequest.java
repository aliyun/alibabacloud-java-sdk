// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class TransferCallToPhoneRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("CallId")
    public String callId;

    @NameInMap("Callee")
    public String callee;

    @NameInMap("Caller")
    public String caller;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionId")
    public String connectionId;

    @NameInMap("HoldConnectionId")
    public String holdConnectionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsSingleTransfer")
    public Boolean isSingleTransfer;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("calleePhone")
    public String calleePhone;

    @NameInMap("callerPhone")
    public String callerPhone;

    public static TransferCallToPhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferCallToPhoneRequest self = new TransferCallToPhoneRequest();
        return TeaModel.build(map, self);
    }

    public TransferCallToPhoneRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public TransferCallToPhoneRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public TransferCallToPhoneRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public TransferCallToPhoneRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public TransferCallToPhoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TransferCallToPhoneRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public TransferCallToPhoneRequest setHoldConnectionId(String holdConnectionId) {
        this.holdConnectionId = holdConnectionId;
        return this;
    }
    public String getHoldConnectionId() {
        return this.holdConnectionId;
    }

    public TransferCallToPhoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TransferCallToPhoneRequest setIsSingleTransfer(Boolean isSingleTransfer) {
        this.isSingleTransfer = isSingleTransfer;
        return this;
    }
    public Boolean getIsSingleTransfer() {
        return this.isSingleTransfer;
    }

    public TransferCallToPhoneRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public TransferCallToPhoneRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public TransferCallToPhoneRequest setCalleePhone(String calleePhone) {
        this.calleePhone = calleePhone;
        return this;
    }
    public String getCalleePhone() {
        return this.calleePhone;
    }

    public TransferCallToPhoneRequest setCallerPhone(String callerPhone) {
        this.callerPhone = callerPhone;
        return this;
    }
    public String getCallerPhone() {
        return this.callerPhone;
    }

}
