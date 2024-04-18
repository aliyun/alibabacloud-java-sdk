// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateParameterResponseBody body;

    public static UpdateParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateParameterResponse self = new UpdateParameterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateParameterResponse setBody(UpdateParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateParameterResponseBody getBody() {
        return this.body;
    }

}
