// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshDetailRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    public static DescribeServiceMeshDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshDetailRequest self = new DescribeServiceMeshDetailRequest();
        return TeaModel.build(map, self);
    }

}
