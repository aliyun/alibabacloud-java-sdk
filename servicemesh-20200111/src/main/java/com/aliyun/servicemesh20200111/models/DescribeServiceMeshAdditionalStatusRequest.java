// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshAdditionalStatusRequest extends TeaModel {
    @NameInMap("CheckMode")
    public String checkMode;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeServiceMeshAdditionalStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshAdditionalStatusRequest self = new DescribeServiceMeshAdditionalStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshAdditionalStatusRequest setCheckMode(String checkMode) {
        this.checkMode = checkMode;
        return this;
    }
    public String getCheckMode() {
        return this.checkMode;
    }

    public DescribeServiceMeshAdditionalStatusRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
