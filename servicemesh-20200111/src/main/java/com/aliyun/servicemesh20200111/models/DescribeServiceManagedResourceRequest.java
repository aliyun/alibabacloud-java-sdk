// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceManagedResourceRequest extends TeaModel {
    @NameInMap("GuestCluster")
    public String guestCluster;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("ServiceName")
    public String serviceName;

    public static DescribeServiceManagedResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceManagedResourceRequest self = new DescribeServiceManagedResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceManagedResourceRequest setGuestCluster(String guestCluster) {
        this.guestCluster = guestCluster;
        return this;
    }
    public String getGuestCluster() {
        return this.guestCluster;
    }

    public DescribeServiceManagedResourceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeServiceManagedResourceRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public DescribeServiceManagedResourceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
