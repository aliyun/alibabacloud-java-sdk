// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class Template extends TeaModel {
    // A time representing the server time when this object was created. Clients may not set this value. Populated by the system. Read-only.
    @NameInMap("createdTime")
    public String createdTime;

    // Date and time at which a deletion is requested by the user. Null when the resource has not been requested for deletion. This field is set by the server, not directly settable by a client. Populated by the system. Read-only.
    @NameInMap("deletionTime")
    public String deletionTime;

    // Human-readable description of the resource
    @NameInMap("description")
    public String description;

    // A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
    @NameInMap("generation")
    public Integer generation;

    // The kind of the resource
    @NameInMap("kind")
    public String kind;

    // Name must be unique within a namespace. Is required when creating resources. Cannot be updated.
    @NameInMap("name")
    public String name;

    // Specification of the desired behavior of the Template.
    @NameInMap("spec")
    public TemplateSpec spec;

    // Most recently observed status of the Template. This data may not be up-to-date. Populated by the system. Read-only.
    @NameInMap("status")
    public TemplateStatus status;

    // Main user ID of an Aliyun account
    @NameInMap("uid")
    public String uid;

    // The major version of the template. "1" by default. You should ONLY increment the major version when the template are not backwards compatible with the previous major version.
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
