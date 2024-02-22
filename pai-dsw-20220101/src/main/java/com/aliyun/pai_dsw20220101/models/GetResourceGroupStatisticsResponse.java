// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetResourceGroupStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceGroupStatisticsResponseBody body;

    public static GetResourceGroupStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupStatisticsResponse self = new GetResourceGroupStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceGroupStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceGroupStatisticsResponse setBody(GetResourceGroupStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceGroupStatisticsResponseBody getBody() {
        return this.body;
    }

}
