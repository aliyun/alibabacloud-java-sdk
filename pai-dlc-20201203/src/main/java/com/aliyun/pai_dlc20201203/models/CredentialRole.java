// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CredentialRole extends TeaModel {
    /**
     * <p>The account on whose behalf the role is assumed.</p>
     */
    @NameInMap("AssumeRoleFor")
    public String assumeRoleFor;

    /**
     * <p>The user identity information used for role assumption.</p>
     */
    @NameInMap("AssumeUserInfo")
    public AssumeUserInfo assumeUserInfo;

    /**
     * <p>The access policy attached during role assumption.</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The ARN of the RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1872xxxxxxxxx:role/account-pai-prod</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The role type. Valid values: service and user.</p>
     * 
     * <strong>example:</strong>
     * <p>service</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    public static CredentialRole build(java.util.Map<String, ?> map) throws Exception {
        CredentialRole self = new CredentialRole();
        return TeaModel.build(map, self);
    }

    public CredentialRole setAssumeRoleFor(String assumeRoleFor) {
        this.assumeRoleFor = assumeRoleFor;
        return this;
    }
    public String getAssumeRoleFor() {
        return this.assumeRoleFor;
    }

    public CredentialRole setAssumeUserInfo(AssumeUserInfo assumeUserInfo) {
        this.assumeUserInfo = assumeUserInfo;
        return this;
    }
    public AssumeUserInfo getAssumeUserInfo() {
        return this.assumeUserInfo;
    }

    public CredentialRole setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CredentialRole setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CredentialRole setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
