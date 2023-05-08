// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClusterPrometheusRequest extends TeaModel {
    /**
     * <p>The ID of the cluster on the data plane.</p>
     */
    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    /**
     * <p>The ID of the region where the cluster on the data plane resides.</p>
     */
    @NameInMap("K8sClusterRegionId")
    public String k8sClusterRegionId;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeClusterPrometheusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterPrometheusRequest self = new DescribeClusterPrometheusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterPrometheusRequest setK8sClusterId(String k8sClusterId) {
        this.k8sClusterId = k8sClusterId;
        return this;
    }
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    public DescribeClusterPrometheusRequest setK8sClusterRegionId(String k8sClusterRegionId) {
        this.k8sClusterRegionId = k8sClusterRegionId;
        return this;
    }
    public String getK8sClusterRegionId() {
        return this.k8sClusterRegionId;
    }

    public DescribeClusterPrometheusRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
