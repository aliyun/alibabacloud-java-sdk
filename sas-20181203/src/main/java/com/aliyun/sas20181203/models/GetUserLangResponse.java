// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetUserLangResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserLangResponseBody body;

    public static GetUserLangResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserLangResponse self = new GetUserLangResponse();
        return TeaModel.build(map, self);
    }

    public GetUserLangResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserLangResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserLangResponse setBody(GetUserLangResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserLangResponseBody getBody() {
        return this.body;
    }

}
