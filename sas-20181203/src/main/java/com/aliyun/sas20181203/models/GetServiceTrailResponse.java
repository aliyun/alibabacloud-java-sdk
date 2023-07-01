// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetServiceTrailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceTrailResponseBody body;

    public static GetServiceTrailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTrailResponse self = new GetServiceTrailResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceTrailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceTrailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceTrailResponse setBody(GetServiceTrailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceTrailResponseBody getBody() {
        return this.body;
    }

}
