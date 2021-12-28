// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterNamespacesRequest extends TeaModel {
    @NameInMap("GuestClusterID")
    public String guestClusterID;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeGuestClusterNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestClusterNamespacesRequest self = new DescribeGuestClusterNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGuestClusterNamespacesRequest setGuestClusterID(String guestClusterID) {
        this.guestClusterID = guestClusterID;
        return this;
    }
    public String getGuestClusterID() {
        return this.guestClusterID;
    }

    public DescribeGuestClusterNamespacesRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
