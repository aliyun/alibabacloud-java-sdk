// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class UpdateAgentRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("SkillGroupId")
    public java.util.List<Long> skillGroupId;

    @NameInMap("SkillGroupIdList")
    public java.util.List<Long> skillGroupIdList;

    public static UpdateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentRequest self = new UpdateAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAgentRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public UpdateAgentRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateAgentRequest setSkillGroupId(java.util.List<Long> skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public java.util.List<Long> getSkillGroupId() {
        return this.skillGroupId;
    }

    public UpdateAgentRequest setSkillGroupIdList(java.util.List<Long> skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public java.util.List<Long> getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

}
