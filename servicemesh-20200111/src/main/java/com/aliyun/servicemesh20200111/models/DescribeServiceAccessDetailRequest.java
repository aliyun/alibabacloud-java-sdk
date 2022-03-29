// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceAccessDetailRequest extends TeaModel {
    @NameInMap("GuestCluster")
    public String guestCluster;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("ServiceName")
    public String serviceName;

    public static DescribeServiceAccessDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAccessDetailRequest self = new DescribeServiceAccessDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAccessDetailRequest setGuestCluster(String guestCluster) {
        this.guestCluster = guestCluster;
        return this;
    }
    public String getGuestCluster() {
        return this.guestCluster;
    }

    public DescribeServiceAccessDetailRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeServiceAccessDetailRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public DescribeServiceAccessDetailRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
