// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListServiceAccountsRequest extends TeaModel {
    /**
     * <p>The ID of the cluster on the data plane.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ce3c25e247da24f3aab9b7edfae83****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ID of the Service Mesh (ASM) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ce134b0727aa2492db69f6c3880e1****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static ListServiceAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceAccountsRequest self = new ListServiceAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceAccountsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListServiceAccountsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListServiceAccountsRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
