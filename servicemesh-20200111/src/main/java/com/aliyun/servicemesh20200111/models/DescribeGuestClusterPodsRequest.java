// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterPodsRequest extends TeaModel {
    /**
     * <p>The ID of the Kubernetes cluster that is added to the ASM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c49ad2169d5a04f2d89dfc4b6bcu****</p>
     */
    @NameInMap("GuestClusterID")
    public String guestClusterID;

    /**
     * <p>The namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ASM instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c78d60f98fa43403ab6e0701b2678****</p>
     */
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
