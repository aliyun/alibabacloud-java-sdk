// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CreateThirdSsoAgentRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RoleIds")
    public java.util.List<Long> roleIds;

    @NameInMap("SkillGroupIds")
    public java.util.List<Long> skillGroupIds;

    public static CreateThirdSsoAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateThirdSsoAgentRequest self = new CreateThirdSsoAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateThirdSsoAgentRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateThirdSsoAgentRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateThirdSsoAgentRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public CreateThirdSsoAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateThirdSsoAgentRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateThirdSsoAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateThirdSsoAgentRequest setRoleIds(java.util.List<Long> roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public java.util.List<Long> getRoleIds() {
        return this.roleIds;
    }

    public CreateThirdSsoAgentRequest setSkillGroupIds(java.util.List<Long> skillGroupIds) {
        this.skillGroupIds = skillGroupIds;
        return this;
    }
    public java.util.List<Long> getSkillGroupIds() {
        return this.skillGroupIds;
    }

}
