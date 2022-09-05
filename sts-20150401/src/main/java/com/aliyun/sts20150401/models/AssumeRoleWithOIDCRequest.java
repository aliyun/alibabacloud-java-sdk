// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithOIDCRequest extends TeaModel {
    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    @NameInMap("OIDCProviderArn")
    public String OIDCProviderArn;

    @NameInMap("OIDCToken")
    public String OIDCToken;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("RoleSessionName")
    public String roleSessionName;

    public static AssumeRoleWithOIDCRequest build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleWithOIDCRequest self = new AssumeRoleWithOIDCRequest();
        return TeaModel.build(map, self);
    }

    public AssumeRoleWithOIDCRequest setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    public AssumeRoleWithOIDCRequest setOIDCProviderArn(String OIDCProviderArn) {
        this.OIDCProviderArn = OIDCProviderArn;
        return this;
    }
    public String getOIDCProviderArn() {
        return this.OIDCProviderArn;
    }

    public AssumeRoleWithOIDCRequest setOIDCToken(String OIDCToken) {
        this.OIDCToken = OIDCToken;
        return this;
    }
    public String getOIDCToken() {
        return this.OIDCToken;
    }

    public AssumeRoleWithOIDCRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AssumeRoleWithOIDCRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public AssumeRoleWithOIDCRequest setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
        return this;
    }
    public String getRoleSessionName() {
        return this.roleSessionName;
    }

}
