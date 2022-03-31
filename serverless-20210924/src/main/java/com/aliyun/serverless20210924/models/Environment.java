// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class Environment extends TeaModel {
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

    // Specification of the desired behavior of the Environment.
    @NameInMap("spec")
    public EnvironmentSpec spec;

    // Most recently observed status of the Environment. This data may not be up-to-date. Populated by the system. Read-only.
    @NameInMap("status")
    public EnvironmentStatus status;

    // Main user ID of an Aliyun account
    @NameInMap("uid")
    public String uid;

    public static Environment build(java.util.Map<String, ?> map) throws Exception {
        Environment self = new Environment();
        return TeaModel.build(map, self);
    }

    public Environment setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Environment setDeletionTime(String deletionTime) {
        this.deletionTime = deletionTime;
        return this;
    }
    public String getDeletionTime() {
        return this.deletionTime;
    }

    public Environment setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Environment setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public Environment setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public Environment setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Environment setSpec(EnvironmentSpec spec) {
        this.spec = spec;
        return this;
    }
    public EnvironmentSpec getSpec() {
        return this.spec;
    }

    public Environment setStatus(EnvironmentStatus status) {
        this.status = status;
        return this;
    }
    public EnvironmentStatus getStatus() {
        return this.status;
    }

    public Environment setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
