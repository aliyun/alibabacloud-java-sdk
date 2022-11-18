// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagOnlineClientStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagOnlineClientStatisticsResponseBody body;

    public static DescribeSagOnlineClientStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagOnlineClientStatisticsResponse self = new DescribeSagOnlineClientStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagOnlineClientStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagOnlineClientStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagOnlineClientStatisticsResponse setBody(DescribeSagOnlineClientStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagOnlineClientStatisticsResponseBody getBody() {
        return this.body;
    }

}
