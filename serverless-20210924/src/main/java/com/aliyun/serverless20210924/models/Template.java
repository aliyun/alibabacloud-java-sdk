// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class Template extends TeaModel {
    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("deletionTime")
    public String deletionTime;

    @NameInMap("description")
    public String description;

    @NameInMap("generation")
    public Integer generation;

    @NameInMap("kind")
    public String kind;

    @NameInMap("name")
    public String name;

    @NameInMap("spec")
    public TemplateSpec spec;

    @NameInMap("status")
    public TemplateStatus status;

    @NameInMap("uid")
    public String uid;

    @NameInMap("version")
    public Integer version;

    public static Template build(java.util.Map<String, ?> map) throws Exception {
        Template self = new Template();
        return TeaModel.build(map, self);
    }

    public Template setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Template setDeletionTime(String deletionTime) {
        this.deletionTime = deletionTime;
        return this;
    }
    public String getDeletionTime() {
        return this.deletionTime;
    }

    public Template setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Template setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public Template setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public Template setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Template setSpec(TemplateSpec spec) {
        this.spec = spec;
        return this;
    }
    public TemplateSpec getSpec() {
        return this.spec;
    }

    public Template setStatus(TemplateStatus status) {
        this.status = status;
        return this;
    }
    public TemplateStatus getStatus() {
        return this.status;
    }

    public Template setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public Template setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
