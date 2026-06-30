// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class GetOriginalFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOriginalFileUrlResponseBody body;

    public static GetOriginalFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOriginalFileUrlResponse self = new GetOriginalFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetOriginalFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOriginalFileUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOriginalFileUrlResponse setBody(GetOriginalFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOriginalFileUrlResponseBody getBody() {
        return this.body;
    }

}
