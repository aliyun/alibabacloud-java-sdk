// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetGrafanaDashboardUrlResponseBody extends TeaModel {
    /**
     * <p>The information about the dashboard.</p>
     */
    @NameInMap("Dashboards")
    public java.util.List<GetGrafanaDashboardUrlResponseBodyDashboards> dashboards;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetGrafanaDashboardUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGrafanaDashboardUrlResponseBody self = new GetGrafanaDashboardUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGrafanaDashboardUrlResponseBody setDashboards(java.util.List<GetGrafanaDashboardUrlResponseBodyDashboards> dashboards) {
        this.dashboards = dashboards;
        return this;
    }
    public java.util.List<GetGrafanaDashboardUrlResponseBodyDashboards> getDashboards() {
        return this.dashboards;
    }

    public GetGrafanaDashboardUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGrafanaDashboardUrlResponseBodyDashboards extends TeaModel {
        /**
         * <p>The name of the dashboard.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL of the dashboard.</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetGrafanaDashboardUrlResponseBodyDashboards build(java.util.Map<String, ?> map) throws Exception {
            GetGrafanaDashboardUrlResponseBodyDashboards self = new GetGrafanaDashboardUrlResponseBodyDashboards();
            return TeaModel.build(map, self);
        }

        public GetGrafanaDashboardUrlResponseBodyDashboards setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetGrafanaDashboardUrlResponseBodyDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
