// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRouteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSagRouteListResponseBody body;

    public static DescribeSagRouteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagRouteListResponse self = new DescribeSagRouteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagRouteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagRouteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagRouteListResponse setBody(DescribeSagRouteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagRouteListResponseBody getBody() {
        return this.body;
    }

}
