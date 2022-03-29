// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateUnlabeledServiceManagedResourceRequest extends TeaModel {
    @NameInMap("GuestCluster")
    public String guestCluster;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("ServiceName")
    public String serviceName;

    public static UpdateUnlabeledServiceManagedResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUnlabeledServiceManagedResourceRequest self = new UpdateUnlabeledServiceManagedResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUnlabeledServiceManagedResourceRequest setGuestCluster(String guestCluster) {
        this.guestCluster = guestCluster;
        return this;
    }
    public String getGuestCluster() {
        return this.guestCluster;
    }

    public UpdateUnlabeledServiceManagedResourceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateUnlabeledServiceManagedResourceRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateUnlabeledServiceManagedResourceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
