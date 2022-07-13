// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class EditEntityRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EditEntityRouteResponseBody body;

    public static EditEntityRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        EditEntityRouteResponse self = new EditEntityRouteResponse();
        return TeaModel.build(map, self);
    }

    public EditEntityRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditEntityRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditEntityRouteResponse setBody(EditEntityRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public EditEntityRouteResponseBody getBody() {
        return this.body;
    }

}
