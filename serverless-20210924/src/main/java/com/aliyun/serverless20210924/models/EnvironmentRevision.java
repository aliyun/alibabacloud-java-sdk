// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class EnvironmentRevision extends TeaModel {
    // A time representing the server time when this object was created. Clients may not set this value. Populated by the system. Read-only.
    @NameInMap("createdTime")
    public String createdTime;

    // The generation of the environment.
    @NameInMap("environmentGeneration")
    public Integer environmentGeneration;

    // The name of an environment.
    @NameInMap("environmentName")
    public String environmentName;

    // The kind of the resource.
    @NameInMap("kind")
    public String kind;

    // Specification of the desired behavior of the Environment.
    @NameInMap("spec")
    public EnvironmentSpec spec;

    // Most recently observed status of the Environment. This data may not be up-to-date. Populated by the system. Read-only.
    @NameInMap("status")
    public EnvironmentStatus status;

    // Main user ID of an Aliyun account.
    @NameInMap("uid")
    public String uid;

    public static EnvironmentRevision build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentRevision self = new EnvironmentRevision();
        return TeaModel.build(map, self);
    }

    public EnvironmentRevision setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public EnvironmentRevision setEnvironmentGeneration(Integer environmentGeneration) {
        this.environmentGeneration = environmentGeneration;
        return this;
    }
    public Integer getEnvironmentGeneration() {
        return this.environmentGeneration;
    }

    public EnvironmentRevision setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    public String getEnvironmentName() {
        return this.environmentName;
    }

    public EnvironmentRevision setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public EnvironmentRevision setSpec(EnvironmentSpec spec) {
        this.spec = spec;
        return this;
    }
    public EnvironmentSpec getSpec() {
        return this.spec;
    }

    public EnvironmentRevision setStatus(EnvironmentStatus status) {
        this.status = status;
        return this;
    }
    public EnvironmentStatus getStatus() {
        return this.status;
    }

    public EnvironmentRevision setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
