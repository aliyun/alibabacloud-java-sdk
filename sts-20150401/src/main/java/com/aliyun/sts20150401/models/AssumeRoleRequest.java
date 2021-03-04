// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleRequest extends TeaModel {
    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("RoleSessionName")
    public String roleSessionName;

    public static AssumeRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleRequest self = new AssumeRoleRequest();
        return TeaModel.build(map, self);
    }

    public AssumeRoleRequest setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    public AssumeRoleRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AssumeRoleRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public AssumeRoleRequest setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
        return this;
    }
    public String getRoleSessionName() {
        return this.roleSessionName;
    }

}
