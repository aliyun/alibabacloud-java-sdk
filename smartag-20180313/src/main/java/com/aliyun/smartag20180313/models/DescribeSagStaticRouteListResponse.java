// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagStaticRouteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSagStaticRouteListResponseBody body;

    public static DescribeSagStaticRouteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagStaticRouteListResponse self = new DescribeSagStaticRouteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagStaticRouteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagStaticRouteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagStaticRouteListResponse setBody(DescribeSagStaticRouteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagStaticRouteListResponseBody getBody() {
        return this.body;
    }

}
