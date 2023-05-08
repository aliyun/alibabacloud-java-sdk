// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClusterGrafanaResponseBody extends TeaModel {
    /**
     * <p>The information of Grafana dashboards.</p>
     */
    @NameInMap("Dashboards")
    public java.util.List<DescribeClusterGrafanaResponseBodyDashboards> dashboards;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterGrafanaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterGrafanaResponseBody self = new DescribeClusterGrafanaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterGrafanaResponseBody setDashboards(java.util.List<DescribeClusterGrafanaResponseBodyDashboards> dashboards) {
        this.dashboards = dashboards;
        return this;
    }
    public java.util.List<DescribeClusterGrafanaResponseBodyDashboards> getDashboards() {
        return this.dashboards;
    }

    public DescribeClusterGrafanaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterGrafanaResponseBodyDashboards extends TeaModel {
        /**
         * <p>The title of the Grafana dashboard.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The endpoint of the Grafana dashboard.</p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeClusterGrafanaResponseBodyDashboards build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterGrafanaResponseBodyDashboards self = new DescribeClusterGrafanaResponseBodyDashboards();
            return TeaModel.build(map, self);
        }

        public DescribeClusterGrafanaResponseBodyDashboards setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeClusterGrafanaResponseBodyDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
