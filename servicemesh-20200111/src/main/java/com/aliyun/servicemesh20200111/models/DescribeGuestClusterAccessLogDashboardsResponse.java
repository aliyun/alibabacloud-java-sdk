// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterAccessLogDashboardsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("K8sClusterId")
    @Validation(required = true)
    public String k8sClusterId;

    @NameInMap("Dashboards")
    @Validation(required = true)
    public java.util.List<DescribeGuestClusterAccessLogDashboardsResponseDashboards> dashboards;

    public static DescribeGuestClusterAccessLogDashboardsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestClusterAccessLogDashboardsResponse self = new DescribeGuestClusterAccessLogDashboardsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeGuestClusterAccessLogDashboardsResponseDashboards extends TeaModel {
        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static DescribeGuestClusterAccessLogDashboardsResponseDashboards build(java.util.Map<String, ?> map) throws Exception {
            DescribeGuestClusterAccessLogDashboardsResponseDashboards self = new DescribeGuestClusterAccessLogDashboardsResponseDashboards();
            return TeaModel.build(map, self);
        }

    }

}
