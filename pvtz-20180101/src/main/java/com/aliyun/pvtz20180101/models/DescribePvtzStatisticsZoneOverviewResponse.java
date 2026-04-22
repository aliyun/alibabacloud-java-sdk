// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsZoneOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePvtzStatisticsZoneOverviewResponseBody body;

    public static DescribePvtzStatisticsZoneOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePvtzStatisticsZoneOverviewResponse self = new DescribePvtzStatisticsZoneOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribePvtzStatisticsZoneOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePvtzStatisticsZoneOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePvtzStatisticsZoneOverviewResponse setBody(DescribePvtzStatisticsZoneOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePvtzStatisticsZoneOverviewResponseBody getBody() {
        return this.body;
    }

}
