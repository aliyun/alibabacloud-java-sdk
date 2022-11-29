// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class EnvironmentRevision extends TeaModel {
    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("environmentGeneration")
    public Integer environmentGeneration;

    @NameInMap("environmentName")
    public String environmentName;

    @NameInMap("kind")
    public String kind;

    @NameInMap("spec")
    public EnvironmentSpec spec;

    @NameInMap("status")
    public EnvironmentStatus status;

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
