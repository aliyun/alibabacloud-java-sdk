// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClusterGrafanaRequest extends TeaModel {
    /**
     * <p>The ID of the cluster on the data plane.</p>
     */
    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    /**
     * <p>The ASM instance ID.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeClusterGrafanaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterGrafanaRequest self = new DescribeClusterGrafanaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterGrafanaRequest setK8sClusterId(String k8sClusterId) {
        this.k8sClusterId = k8sClusterId;
        return this;
    }
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    public DescribeClusterGrafanaRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
