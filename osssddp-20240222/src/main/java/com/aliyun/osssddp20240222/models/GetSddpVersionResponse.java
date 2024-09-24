// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.osssddp20240222.models;

import com.aliyun.tea.*;

public class GetSddpVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSddpVersionResponseBody body;

    public static GetSddpVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSddpVersionResponse self = new GetSddpVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetSddpVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSddpVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSddpVersionResponse setBody(GetSddpVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSddpVersionResponseBody getBody() {
        return this.body;
    }

}
