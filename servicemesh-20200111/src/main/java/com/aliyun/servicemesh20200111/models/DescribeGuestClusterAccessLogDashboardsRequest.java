// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterAccessLogDashboardsRequest extends TeaModel {
    @NameInMap("K8sClusterId")
    @Validation(required = true)
    public String k8sClusterId;

    public static DescribeGuestClusterAccessLogDashboardsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestClusterAccessLogDashboardsRequest self = new DescribeGuestClusterAccessLogDashboardsRequest();
        return TeaModel.build(map, self);
    }

}
