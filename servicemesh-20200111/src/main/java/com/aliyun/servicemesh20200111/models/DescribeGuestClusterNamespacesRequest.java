// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterNamespacesRequest extends TeaModel {
    /**
     * <p>The ID of the Kubernetes cluster that is added to the ASM instance.</p>
     */
    @NameInMap("GuestClusterID")
    public String guestClusterID;

    /**
     * <p>The ASM instance ID.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>Specifies whether to return the labels of the namespaces.</p>
     */
    @NameInMap("ShowNsLabels")
    public Boolean showNsLabels;

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

    public DescribeGuestClusterNamespacesRequest setShowNsLabels(Boolean showNsLabels) {
        this.showNsLabels = showNsLabels;
        return this;
    }
    public Boolean getShowNsLabels() {
        return this.showNsLabels;
    }

}
