// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterPodsRequest extends TeaModel {
    @NameInMap("GuestClusterID")
    public String guestClusterID;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeGuestClusterPodsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestClusterPodsRequest self = new DescribeGuestClusterPodsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGuestClusterPodsRequest setGuestClusterID(String guestClusterID) {
        this.guestClusterID = guestClusterID;
        return this;
    }
    public String getGuestClusterID() {
        return this.guestClusterID;
    }

    public DescribeGuestClusterPodsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeGuestClusterPodsRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
