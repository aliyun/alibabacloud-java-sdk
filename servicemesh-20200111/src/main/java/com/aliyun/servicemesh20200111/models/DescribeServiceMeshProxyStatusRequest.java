// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshProxyStatusRequest extends TeaModel {
    /**
     * <p>The ASM instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca04bc38979214bf2882be79d39b4****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeServiceMeshProxyStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshProxyStatusRequest self = new DescribeServiceMeshProxyStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshProxyStatusRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
