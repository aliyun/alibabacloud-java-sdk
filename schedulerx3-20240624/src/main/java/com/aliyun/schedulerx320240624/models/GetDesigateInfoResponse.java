// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetDesigateInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDesigateInfoResponseBody body;

    public static GetDesigateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDesigateInfoResponse self = new GetDesigateInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDesigateInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDesigateInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDesigateInfoResponse setBody(GetDesigateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDesigateInfoResponseBody getBody() {
        return this.body;
    }

}
