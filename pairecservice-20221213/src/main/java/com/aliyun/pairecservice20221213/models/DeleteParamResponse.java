// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteParamResponseBody body;

    public static DeleteParamResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteParamResponse self = new DeleteParamResponse();
        return TeaModel.build(map, self);
    }

    public DeleteParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteParamResponse setBody(DeleteParamResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteParamResponseBody getBody() {
        return this.body;
    }

}
