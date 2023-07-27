// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateASMNamespaceFromGuestClusterRequest extends TeaModel {
    /**
     * <p>The ID of the Kubernetes cluster whose namespace information you want to synchronize to ASM. The Kubernetes cluster is added to the ASM instance that is specified by the ServiceMeshId parameter.</p>
     */
    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    /**
     * <p>The ASM instance ID.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static UpdateASMNamespaceFromGuestClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateASMNamespaceFromGuestClusterRequest self = new UpdateASMNamespaceFromGuestClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateASMNamespaceFromGuestClusterRequest setK8sClusterId(String k8sClusterId) {
        this.k8sClusterId = k8sClusterId;
        return this;
    }
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    public UpdateASMNamespaceFromGuestClusterRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
