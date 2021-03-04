// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithSAMLRequest extends TeaModel {
    @NameInMap("SAMLProviderArn")
    public String SAMLProviderArn;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("SAMLAssertion")
    public String SAMLAssertion;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    public static AssumeRoleWithSAMLRequest build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleWithSAMLRequest self = new AssumeRoleWithSAMLRequest();
        return TeaModel.build(map, self);
    }

    public AssumeRoleWithSAMLRequest setSAMLProviderArn(String SAMLProviderArn) {
        this.SAMLProviderArn = SAMLProviderArn;
        return this;
    }
    public String getSAMLProviderArn() {
        return this.SAMLProviderArn;
    }

    public AssumeRoleWithSAMLRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public AssumeRoleWithSAMLRequest setSAMLAssertion(String SAMLAssertion) {
        this.SAMLAssertion = SAMLAssertion;
        return this;
    }
    public String getSAMLAssertion() {
        return this.SAMLAssertion;
    }

    public AssumeRoleWithSAMLRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AssumeRoleWithSAMLRequest setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

}
