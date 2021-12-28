// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeExtensionProviderRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Type")
    public String type;

    public static DescribeExtensionProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExtensionProviderRequest self = new DescribeExtensionProviderRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExtensionProviderRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public DescribeExtensionProviderRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
