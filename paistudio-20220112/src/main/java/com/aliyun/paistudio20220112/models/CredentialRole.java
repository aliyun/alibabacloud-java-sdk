// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CredentialRole extends TeaModel {
    /**
     * <p>The entity that uses the role credentials.</p>
     */
    @NameInMap("AssumeRoleFor")
    public String assumeRoleFor;

    /**
     * <p>The user information for role assumption.</p>
     */
    @NameInMap("AssumeUserInfo")
    public AssumeUserInfo assumeUserInfo;

    /**
     * <p>The access policy.</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The ARN of the RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1157703270994901:role/aliyunserviceroleforpaiworkspace</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The role type.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
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
