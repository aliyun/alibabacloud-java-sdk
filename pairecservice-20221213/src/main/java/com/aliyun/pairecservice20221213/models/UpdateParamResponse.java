// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateParamResponseBody body;

    public static UpdateParamResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateParamResponse self = new UpdateParamResponse();
        return TeaModel.build(map, self);
    }

    public UpdateParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateParamResponse setBody(UpdateParamResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateParamResponseBody getBody() {
        return this.body;
    }

}
