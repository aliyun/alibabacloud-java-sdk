// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClusterGrafanaRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    public static DescribeClusterGrafanaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterGrafanaRequest self = new DescribeClusterGrafanaRequest();
        return TeaModel.build(map, self);
    }

}
