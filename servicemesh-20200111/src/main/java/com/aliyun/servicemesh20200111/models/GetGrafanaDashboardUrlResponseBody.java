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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>76DBB8A0-5AA6-5A56-9A8A-****</p>
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
         * 
         * <strong>example:</strong>
         * <p>Cloud ASM Istio Http Gateway</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL of the dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://g.console.aliyun.com/d/181863583797****-14651340-200-2/alibaba-cloud-mesh-service?orgId=32****&refresh=60s">https://g.console.aliyun.com/d/181863583797****-14651340-200-2/alibaba-cloud-mesh-service?orgId=32****&amp;refresh=60s</a></p>
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
