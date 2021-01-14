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

    public DescribeGuestClusterAccessLogDashboardsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGuestClusterAccessLogDashboardsResponse setK8sClusterId(String k8sClusterId) {
        this.k8sClusterId = k8sClusterId;
        return this;
    }
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    public DescribeGuestClusterAccessLogDashboardsResponse setDashboards(java.util.List<DescribeGuestClusterAccessLogDashboardsResponseDashboards> dashboards) {
        this.dashboards = dashboards;
        return this;
    }
    public java.util.List<DescribeGuestClusterAccessLogDashboardsResponseDashboards> getDashboards() {
        return this.dashboards;
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

        public DescribeGuestClusterAccessLogDashboardsResponseDashboards setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeGuestClusterAccessLogDashboardsResponseDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
