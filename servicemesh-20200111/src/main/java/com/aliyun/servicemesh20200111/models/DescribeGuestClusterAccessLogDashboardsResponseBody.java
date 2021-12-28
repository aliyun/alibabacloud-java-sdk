// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterAccessLogDashboardsResponseBody extends TeaModel {
    @NameInMap("Dashboards")
    public java.util.List<DescribeGuestClusterAccessLogDashboardsResponseBodyDashboards> dashboards;

    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGuestClusterAccessLogDashboardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestClusterAccessLogDashboardsResponseBody self = new DescribeGuestClusterAccessLogDashboardsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGuestClusterAccessLogDashboardsResponseBody setDashboards(java.util.List<DescribeGuestClusterAccessLogDashboardsResponseBodyDashboards> dashboards) {
        this.dashboards = dashboards;
        return this;
    }
    public java.util.List<DescribeGuestClusterAccessLogDashboardsResponseBodyDashboards> getDashboards() {
        return this.dashboards;
    }

    public DescribeGuestClusterAccessLogDashboardsResponseBody setK8sClusterId(String k8sClusterId) {
        this.k8sClusterId = k8sClusterId;
        return this;
    }
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    public DescribeGuestClusterAccessLogDashboardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGuestClusterAccessLogDashboardsResponseBodyDashboards extends TeaModel {
        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        public static DescribeGuestClusterAccessLogDashboardsResponseBodyDashboards build(java.util.Map<String, ?> map) throws Exception {
            DescribeGuestClusterAccessLogDashboardsResponseBodyDashboards self = new DescribeGuestClusterAccessLogDashboardsResponseBodyDashboards();
            return TeaModel.build(map, self);
        }

        public DescribeGuestClusterAccessLogDashboardsResponseBodyDashboards setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeGuestClusterAccessLogDashboardsResponseBodyDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
