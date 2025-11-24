// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetGrafanaDashboardUrlRequest extends TeaModel {
    /**
     * <p>The ID of the Container Service for Kubernetes (ACK) or ACK Serverless cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c94ca2d27f7aa47ab84ed73e6f084****</p>
     */
    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    /**
     * <p>The ID of the Service Mesh (ASM) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cb8963379255149cb98c8686f274x****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The name of the dashboard.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloud ASM Istio Http Gateway</p>
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
