// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckMnsServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckMnsServiceResponseBody body;

    public static CheckMnsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMnsServiceResponse self = new CheckMnsServiceResponse();
        return TeaModel.build(map, self);
    }

    public CheckMnsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMnsServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckMnsServiceResponse setBody(CheckMnsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMnsServiceResponseBody getBody() {
        return this.body;
    }

}
