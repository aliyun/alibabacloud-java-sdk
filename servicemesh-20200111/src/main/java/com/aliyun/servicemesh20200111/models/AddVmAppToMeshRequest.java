// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddVmAppToMeshRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Ips")
    public String ips;

    @NameInMap("Ports")
    public String ports;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("Annotations")
    public String annotations;

    @NameInMap("ServiceAccount")
    public String serviceAccount;

    @NameInMap("UseWorkload")
    public Boolean useWorkload;

    @NameInMap("Force")
    public Boolean force;

    public static AddVmAppToMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVmAppToMeshRequest self = new AddVmAppToMeshRequest();
        return TeaModel.build(map, self);
    }

    public AddVmAppToMeshRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public AddVmAppToMeshRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AddVmAppToMeshRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public AddVmAppToMeshRequest setIps(String ips) {
        this.ips = ips;
        return this;
    }
    public String getIps() {
        return this.ips;
    }

    public AddVmAppToMeshRequest setPorts(String ports) {
        this.ports = ports;
        return this;
    }
    public String getPorts() {
        return this.ports;
    }

    public AddVmAppToMeshRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public AddVmAppToMeshRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public AddVmAppToMeshRequest setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }
    public String getServiceAccount() {
        return this.serviceAccount;
    }

    public AddVmAppToMeshRequest setUseWorkload(Boolean useWorkload) {
        this.useWorkload = useWorkload;
        return this;
    }
    public Boolean getUseWorkload() {
        return this.useWorkload;
    }

    public AddVmAppToMeshRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
