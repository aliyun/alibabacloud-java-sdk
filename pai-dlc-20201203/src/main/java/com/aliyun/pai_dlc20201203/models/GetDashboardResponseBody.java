// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetDashboardResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://dlcj1jzm1p01saqw-spark.pre-dsw-gateway-cn-hangzhou.data.aliyun.com">https://dlcj1jzm1p01saqw-spark.pre-dsw-gateway-cn-hangzhou.data.aliyun.com</a></p>
     */
    @NameInMap("url")
    public String url;

    public static GetDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDashboardResponseBody self = new GetDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDashboardResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
