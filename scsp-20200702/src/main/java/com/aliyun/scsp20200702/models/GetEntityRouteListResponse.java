// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetEntityRouteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEntityRouteListResponseBody body;

    public static GetEntityRouteListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEntityRouteListResponse self = new GetEntityRouteListResponse();
        return TeaModel.build(map, self);
    }

    public GetEntityRouteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEntityRouteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEntityRouteListResponse setBody(GetEntityRouteListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEntityRouteListResponseBody getBody() {
        return this.body;
    }

}
