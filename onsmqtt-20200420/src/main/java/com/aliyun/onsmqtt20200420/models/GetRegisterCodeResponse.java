// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetRegisterCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRegisterCodeResponseBody body;

    public static GetRegisterCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegisterCodeResponse self = new GetRegisterCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetRegisterCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegisterCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRegisterCodeResponse setBody(GetRegisterCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegisterCodeResponseBody getBody() {
        return this.body;
    }

}
