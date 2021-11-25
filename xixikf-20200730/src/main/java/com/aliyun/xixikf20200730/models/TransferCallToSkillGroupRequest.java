// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class TransferCallToSkillGroupRequest extends TeaModel {
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
    public Boolean isSingleTransfer;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("SkillGroupId")
    public Long skillGroupId;

    @NameInMap("Type")
    public Integer type;

    public static TransferCallToSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferCallToSkillGroupRequest self = new TransferCallToSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public TransferCallToSkillGroupRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public TransferCallToSkillGroupRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public TransferCallToSkillGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TransferCallToSkillGroupRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public TransferCallToSkillGroupRequest setHoldConnectionId(String holdConnectionId) {
        this.holdConnectionId = holdConnectionId;
        return this;
    }
    public String getHoldConnectionId() {
        return this.holdConnectionId;
    }

    public TransferCallToSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TransferCallToSkillGroupRequest setIsSingleTransfer(Boolean isSingleTransfer) {
        this.isSingleTransfer = isSingleTransfer;
        return this;
    }
    public Boolean getIsSingleTransfer() {
        return this.isSingleTransfer;
    }

    public TransferCallToSkillGroupRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public TransferCallToSkillGroupRequest setSkillGroupId(Long skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public Long getSkillGroupId() {
        return this.skillGroupId;
    }

    public TransferCallToSkillGroupRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
