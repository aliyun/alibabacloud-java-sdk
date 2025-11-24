// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClusterGrafanaRequest extends TeaModel {
    /**
     * <p>The ID of the cluster on the data plane.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ce3c25e247da24f3aab9b7edfae83****</p>
     */
    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    /**
     * <p>Specifies whether to integrate Managed Service for Prometheus for the cluster on the data plane.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("ReAddPrometheusIntegration")
    public String reAddPrometheusIntegration;

    /**
     * <p>The ASM instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cb8963379255149cb98c8686f274x****</p>
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

    public DescribeClusterGrafanaRequest setReAddPrometheusIntegration(String reAddPrometheusIntegration) {
        this.reAddPrometheusIntegration = reAddPrometheusIntegration;
        return this;
    }
    public String getReAddPrometheusIntegration() {
        return this.reAddPrometheusIntegration;
    }

    public DescribeClusterGrafanaRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
