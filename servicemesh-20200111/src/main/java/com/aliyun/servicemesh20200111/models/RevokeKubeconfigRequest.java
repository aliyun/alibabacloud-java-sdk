// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RevokeKubeconfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the kubeconfig file for private access.</p>
     * <ul>
     * <li><code>true</code>: returns the kubeconfig file for private access.</li>
     * <li><code>false</code>: returns the kubeconfig file for public access.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrivateIpAddress")
    public Boolean privateIpAddress;

    /**
     * <p>The ID of the ASM instance for which you want to revoke its kubeconfig file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cf08a11940e8c46c48bc791fcdb3****</p>
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
