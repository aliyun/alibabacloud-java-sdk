// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterAccessLogDashboardsRequest extends TeaModel {
    /**
     * <p>The ID of the cluster on the data plane.</p>
     */
    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    public static DescribeGuestClusterAccessLogDashboardsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestClusterAccessLogDashboardsRequest self = new DescribeGuestClusterAccessLogDashboardsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGuestClusterAccessLogDashboardsRequest setK8sClusterId(String k8sClusterId) {
        this.k8sClusterId = k8sClusterId;
        return this;
    }
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

}
