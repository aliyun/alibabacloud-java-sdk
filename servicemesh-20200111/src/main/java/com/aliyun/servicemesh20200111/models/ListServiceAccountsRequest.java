// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListServiceAccountsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Namespace")
    public String namespace;

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
