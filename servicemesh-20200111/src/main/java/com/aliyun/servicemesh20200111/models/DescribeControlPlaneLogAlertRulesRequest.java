// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeControlPlaneLogAlertRulesRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeControlPlaneLogAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeControlPlaneLogAlertRulesRequest self = new DescribeControlPlaneLogAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeControlPlaneLogAlertRulesRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
