// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshKubeconfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the kubeconfig file that is used for Internet access or internal network access.</p>
     */
    @NameInMap("PrivateIpAddress")
    public Boolean privateIpAddress;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeServiceMeshKubeconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshKubeconfigRequest self = new DescribeServiceMeshKubeconfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshKubeconfigRequest setPrivateIpAddress(Boolean privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public Boolean getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public DescribeServiceMeshKubeconfigRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
