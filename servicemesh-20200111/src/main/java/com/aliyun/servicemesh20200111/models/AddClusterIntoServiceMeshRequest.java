// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddClusterIntoServiceMeshRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>添加集群时不检查目标集群是否存在istio-system namespace，一般用于自建istio 迁移ASM 场景</p>
     */
    @NameInMap("IgnoreNamespaceCheck")
    public Boolean ignoreNamespaceCheck;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static AddClusterIntoServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        AddClusterIntoServiceMeshRequest self = new AddClusterIntoServiceMeshRequest();
        return TeaModel.build(map, self);
    }

    public AddClusterIntoServiceMeshRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddClusterIntoServiceMeshRequest setIgnoreNamespaceCheck(Boolean ignoreNamespaceCheck) {
        this.ignoreNamespaceCheck = ignoreNamespaceCheck;
        return this;
    }
    public Boolean getIgnoreNamespaceCheck() {
        return this.ignoreNamespaceCheck;
    }

    public AddClusterIntoServiceMeshRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
