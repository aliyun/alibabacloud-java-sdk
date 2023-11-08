// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RevokeKubeconfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the kubeconfig file for private access.</p>
     * <br>
     * <p>*   `true`: returns the kubeconfig file for private access.</p>
     * <p>*   `false`: returns the kubeconfig file for public access.</p>
     */
    @NameInMap("PrivateIpAddress")
    public Boolean privateIpAddress;

    /**
     * <p>The ID of the ASM instance for which you want to revoke its kubeconfig file.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static RevokeKubeconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeKubeconfigRequest self = new RevokeKubeconfigRequest();
        return TeaModel.build(map, self);
    }

    public RevokeKubeconfigRequest setPrivateIpAddress(Boolean privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public Boolean getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public RevokeKubeconfigRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
