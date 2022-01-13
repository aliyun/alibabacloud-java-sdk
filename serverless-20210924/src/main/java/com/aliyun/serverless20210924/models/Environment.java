// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class Environment extends TeaModel {
    // A time representing the server time when this object was created. Clients may not set this value. Populated by the system. Read-only.
    @NameInMap("creationTime")
    public String creationTime;

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

    // Specification of the desired behavior of the Environment
    @NameInMap("spec")
    public EnvironmentSpec spec;

    // Most recently observed status of the Environment. This data may not be up-to-date. Populated by the system. Read-only
    @NameInMap("status")
    public EnvironmentStatus status;

    // Main user ID of an Aliyun account
    @NameInMap("uid")
    public String uid;

    public static Environment build(java.util.Map<String, ?> map) throws Exception {
        Environment self = new Environment();
        return TeaModel.build(map, self);
    }

    public Environment setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
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

    public static class EnvironmentSpec extends TeaModel {
        // A region ID at Aliyun. For example, "cn-hangzhou"
        @NameInMap("region")
        public String region;

        // The ARN (Aliyun Resource Name) of the role designated by a user to allow the system to manage his Aliyun resources. If null, use roleArn of role AliyunFCDefaultRole.
        @NameInMap("roleArn")
        public String roleArn;

        // The name of the template for the Environment
        @NameInMap("template")
        public String template;

        // Variables for specified template
        @NameInMap("templateVariables")
        public java.util.Map<String, ?> templateVariables;

        public static EnvironmentSpec build(java.util.Map<String, ?> map) throws Exception {
            EnvironmentSpec self = new EnvironmentSpec();
            return TeaModel.build(map, self);
        }

        public EnvironmentSpec setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public EnvironmentSpec setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public EnvironmentSpec setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public EnvironmentSpec setTemplateVariables(java.util.Map<String, ?> templateVariables) {
            this.templateVariables = templateVariables;
            return this;
        }
        public java.util.Map<String, ?> getTemplateVariables() {
            return this.templateVariables;
        }

    }

    public static class EnvironmentStatus extends TeaModel {
        // Credentials required for tasks
        @NameInMap("credentials")
        public StsCredentials credentials;

        // A human-readable message indicating details about why the Environment is in this condition
        @NameInMap("message")
        public String message;

        // The most recent generation observed
        @NameInMap("observedGeneration")
        public Integer observedGeneration;

        // Time when the last update of the status is observed
        @NameInMap("observedTime")
        public String observedTime;

        // Details of current state of the Environment
        @NameInMap("output")
        public java.util.Map<String, ?> output;

        // A simple, high-level summary of where the Environment is in its lifecycle
        @NameInMap("phase")
        public String phase;

        public static EnvironmentStatus build(java.util.Map<String, ?> map) throws Exception {
            EnvironmentStatus self = new EnvironmentStatus();
            return TeaModel.build(map, self);
        }

        public EnvironmentStatus setCredentials(StsCredentials credentials) {
            this.credentials = credentials;
            return this;
        }
        public StsCredentials getCredentials() {
            return this.credentials;
        }

        public EnvironmentStatus setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public EnvironmentStatus setObservedGeneration(Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public Integer getObservedGeneration() {
            return this.observedGeneration;
        }

        public EnvironmentStatus setObservedTime(String observedTime) {
            this.observedTime = observedTime;
            return this;
        }
        public String getObservedTime() {
            return this.observedTime;
        }

        public EnvironmentStatus setOutput(java.util.Map<String, ?> output) {
            this.output = output;
            return this;
        }
        public java.util.Map<String, ?> getOutput() {
            return this.output;
        }

        public EnvironmentStatus setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

    }

}
