// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RevokeKubeconfigRequest extends TeaModel {
    @NameInMap("PrivateIpAddress")
    public Boolean privateIpAddress;

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
