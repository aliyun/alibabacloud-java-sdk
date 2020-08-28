// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshKubeconfigRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    @NameInMap("PrivateIpAddress")
    public Boolean privateIpAddress;

    public static DescribeServiceMeshKubeconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshKubeconfigRequest self = new DescribeServiceMeshKubeconfigRequest();
        return TeaModel.build(map, self);
    }

}
