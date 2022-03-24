// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ServiceRevision extends TeaModel {
    // A time representing the server time when this object was created. Clients may not set this value. Populated by the system. Read-only.
    @NameInMap("createdTime")
    public String createdTime;

    // The kind of the resource.
    @NameInMap("kind")
    public String kind;

    // The generation of the service.
    @NameInMap("serviceGeneration")
    public Integer serviceGeneration;

    // The name of a service.
    @NameInMap("serviceName")
    public String serviceName;

    // Specification of the desired behavior of the Service.
    @NameInMap("spec")
    public ServiceSpec spec;

    // Most recently observed status of the Environment. This data may not be up-to-date. Populated by the system. Read-only.
    @NameInMap("status")
    public EnvironmentStatus status;

    // Main user ID of an Aliyun account.
    @NameInMap("uid")
    public String uid;

    public static ServiceRevision build(java.util.Map<String, ?> map) throws Exception {
        ServiceRevision self = new ServiceRevision();
        return TeaModel.build(map, self);
    }

    public ServiceRevision setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ServiceRevision setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public ServiceRevision setServiceGeneration(Integer serviceGeneration) {
        this.serviceGeneration = serviceGeneration;
        return this;
    }
    public Integer getServiceGeneration() {
        return this.serviceGeneration;
    }

    public ServiceRevision setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ServiceRevision setSpec(ServiceSpec spec) {
        this.spec = spec;
        return this;
    }
    public ServiceSpec getSpec() {
        return this.spec;
    }

    public ServiceRevision setStatus(EnvironmentStatus status) {
        this.status = status;
        return this;
    }
    public EnvironmentStatus getStatus() {
        return this.status;
    }

    public ServiceRevision setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
