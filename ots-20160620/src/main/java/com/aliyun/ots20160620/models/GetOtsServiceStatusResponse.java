// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class GetOtsServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOtsServiceStatusResponseBody body;

    public static GetOtsServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOtsServiceStatusResponse self = new GetOtsServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetOtsServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOtsServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOtsServiceStatusResponse setBody(GetOtsServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOtsServiceStatusResponseBody getBody() {
        return this.body;
    }

}
