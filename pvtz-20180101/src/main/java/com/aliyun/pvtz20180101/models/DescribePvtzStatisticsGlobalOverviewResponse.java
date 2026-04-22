// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsGlobalOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePvtzStatisticsGlobalOverviewResponseBody body;

    public static DescribePvtzStatisticsGlobalOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePvtzStatisticsGlobalOverviewResponse self = new DescribePvtzStatisticsGlobalOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribePvtzStatisticsGlobalOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePvtzStatisticsGlobalOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePvtzStatisticsGlobalOverviewResponse setBody(DescribePvtzStatisticsGlobalOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePvtzStatisticsGlobalOverviewResponseBody getBody() {
        return this.body;
    }

}
