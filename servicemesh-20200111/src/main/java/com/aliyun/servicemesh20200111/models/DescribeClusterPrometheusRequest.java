// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClusterPrometheusRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    @NameInMap("K8sClusterRegionId")
    public String k8sClusterRegionId;

    public static DescribeClusterPrometheusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterPrometheusRequest self = new DescribeClusterPrometheusRequest();
        return TeaModel.build(map, self);
    }

}
