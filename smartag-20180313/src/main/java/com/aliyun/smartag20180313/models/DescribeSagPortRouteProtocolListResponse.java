// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagPortRouteProtocolListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSagPortRouteProtocolListResponseBody body;

    public static DescribeSagPortRouteProtocolListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagPortRouteProtocolListResponse self = new DescribeSagPortRouteProtocolListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagPortRouteProtocolListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagPortRouteProtocolListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagPortRouteProtocolListResponse setBody(DescribeSagPortRouteProtocolListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagPortRouteProtocolListResponseBody getBody() {
        return this.body;
    }

}
