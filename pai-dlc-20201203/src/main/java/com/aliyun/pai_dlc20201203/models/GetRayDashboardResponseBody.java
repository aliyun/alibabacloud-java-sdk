// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRayDashboardResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("metricsEnabled")
    public String metricsEnabled;

    /**
     * <strong>example:</strong>
     * <p><a href="https://pre-pai-dlc-proxy-cn-hangzhou.aliyun.com/ray/dashboard/dlc1k7426goc7bvy">https://pre-pai-dlc-proxy-cn-hangzhou.aliyun.com/ray/dashboard/dlc1k7426goc7bvy</a></p>
     */
    @NameInMap("url")
    public String url;

    public static GetRayDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRayDashboardResponseBody self = new GetRayDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRayDashboardResponseBody setMetricsEnabled(String metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
        return this;
    }
    public String getMetricsEnabled() {
        return this.metricsEnabled;
    }

    public GetRayDashboardResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
