// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeUpgradeVersionRequest extends TeaModel {
    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeUpgradeVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeVersionRequest self = new DescribeUpgradeVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeVersionRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
