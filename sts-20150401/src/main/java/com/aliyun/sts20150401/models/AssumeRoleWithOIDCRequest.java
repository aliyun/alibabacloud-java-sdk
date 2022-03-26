// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithOIDCRequest extends TeaModel {
    // Session过期时间，单位为秒。
    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    // OIDC Provider的ARN
    @NameInMap("OIDCProviderArn")
    public String OIDCProviderArn;

    // OIDC的ID Token，需输入原始Token，无需Base64解码
    @NameInMap("OIDCToken")
    public String OIDCToken;

    // 权限策略。 生成STS Token时可以指定一个额外的权限策略，以进一步限制STS Token的权限。若不指定则返回的Token拥有指定角色的所有权限。
    @NameInMap("Policy")
    public String policy;

    // 需要扮演的角色的ARN
    @NameInMap("RoleArn")
    public String roleArn;

    // 用户自定义参数。此参数用来区分不同的令牌，可用于用户级别的访问审计。
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
