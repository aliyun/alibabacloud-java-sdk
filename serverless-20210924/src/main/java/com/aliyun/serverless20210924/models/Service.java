// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class Service extends TeaModel {
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

    // Specification of the desired behavior of the Service
    @NameInMap("spec")
    public ServiceSpec spec;

    // Most recently observed status of the Service. This data may not be up-to-date. Populated by the system. Read-only
    @NameInMap("status")
    public ServiceStatus status;

    // Main user ID of an Aliyun account
    @NameInMap("uid")
    public String uid;

    public static Service build(java.util.Map<String, ?> map) throws Exception {
        Service self = new Service();
        return TeaModel.build(map, self);
    }

    public Service setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public Service setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Service setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public Service setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public Service setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Service setSpec(ServiceSpec spec) {
        this.spec = spec;
        return this;
    }
    public ServiceSpec getSpec() {
        return this.spec;
    }

    public Service setStatus(ServiceStatus status) {
        this.status = status;
        return this;
    }
    public ServiceStatus getStatus() {
        return this.status;
    }

    public Service setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class ServiceSpec extends TeaModel {
        // The name of the associated Environment for the Service
        @NameInMap("environment")
        public String environment;

        // The ARN (Aliyun Resource Name) of the role designated by a user to allow the system to manage his Aliyun resources. If null, use roleArn of role AliyunFCDefaultRole.
        @NameInMap("roleArn")
        public String roleArn;

        // The name of the template for the Service
        @NameInMap("template")
        public String template;

        // Variables for specified template
        @NameInMap("templateVariables")
        public java.util.Map<String, ?> templateVariables;

        public static ServiceSpec build(java.util.Map<String, ?> map) throws Exception {
            ServiceSpec self = new ServiceSpec();
            return TeaModel.build(map, self);
        }

        public ServiceSpec setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public ServiceSpec setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ServiceSpec setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ServiceSpec setTemplateVariables(java.util.Map<String, ?> templateVariables) {
            this.templateVariables = templateVariables;
            return this;
        }
        public java.util.Map<String, ?> getTemplateVariables() {
            return this.templateVariables;
        }

    }

    public static class ServiceStatus extends TeaModel {
        // Credentials required for tasks
        @NameInMap("credentials")
        public StsCredentials credentials;

        // A human-readable message indicating details about why the Service is in this condition
        @NameInMap("message")
        public String message;

        // The most recent generation observed
        @NameInMap("observedGeneration")
        public Integer observedGeneration;

        // Time when the last update of the status is observed
        @NameInMap("observedTime")
        public String observedTime;

        // Details of current state of the Service
        @NameInMap("output")
        public java.util.Map<String, ?> output;

        // A simple, high-level summary of where the Service is in its lifecycle
        @NameInMap("phase")
        public String phase;

        public static ServiceStatus build(java.util.Map<String, ?> map) throws Exception {
            ServiceStatus self = new ServiceStatus();
            return TeaModel.build(map, self);
        }

        public ServiceStatus setCredentials(StsCredentials credentials) {
            this.credentials = credentials;
            return this;
        }
        public StsCredentials getCredentials() {
            return this.credentials;
        }

        public ServiceStatus setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ServiceStatus setObservedGeneration(Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public Integer getObservedGeneration() {
            return this.observedGeneration;
        }

        public ServiceStatus setObservedTime(String observedTime) {
            this.observedTime = observedTime;
            return this;
        }
        public String getObservedTime() {
            return this.observedTime;
        }

        public ServiceStatus setOutput(java.util.Map<String, ?> output) {
            this.output = output;
            return this;
        }
        public java.util.Map<String, ?> getOutput() {
            return this.output;
        }

        public ServiceStatus setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

    }

}
