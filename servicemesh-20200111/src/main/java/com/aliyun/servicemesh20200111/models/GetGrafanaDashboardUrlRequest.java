// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetGrafanaDashboardUrlRequest extends TeaModel {
    /**
     * <p>The ID of the Container Service for Kubernetes (ACK) or serverless Kubernetes (ASK) cluster.</p>
     */
    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    /**
     * <p>The ID of the Alibaba Cloud Service Mesh (ASM) instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The name of the dashboard.</p>
     */
    @NameInMap("Title")
    public String title;

    public static GetGrafanaDashboardUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGrafanaDashboardUrlRequest self = new GetGrafanaDashboardUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetGrafanaDashboardUrlRequest setK8sClusterId(String k8sClusterId) {
        this.k8sClusterId = k8sClusterId;
        return this;
    }
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    public GetGrafanaDashboardUrlRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public GetGrafanaDashboardUrlRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
