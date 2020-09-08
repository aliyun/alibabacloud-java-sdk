// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClusterGrafanaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Dashboards")
    @Validation(required = true)
    public java.util.List<DescribeClusterGrafanaResponseDashboards> dashboards;

    public static DescribeClusterGrafanaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterGrafanaResponse self = new DescribeClusterGrafanaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterGrafanaResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterGrafanaResponse setDashboards(java.util.List<DescribeClusterGrafanaResponseDashboards> dashboards) {
        this.dashboards = dashboards;
        return this;
    }
    public java.util.List<DescribeClusterGrafanaResponseDashboards> getDashboards() {
        return this.dashboards;
    }

    public static class DescribeClusterGrafanaResponseDashboards extends TeaModel {
        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        public static DescribeClusterGrafanaResponseDashboards build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterGrafanaResponseDashboards self = new DescribeClusterGrafanaResponseDashboards();
            return TeaModel.build(map, self);
        }

        public DescribeClusterGrafanaResponseDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeClusterGrafanaResponseDashboards setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
