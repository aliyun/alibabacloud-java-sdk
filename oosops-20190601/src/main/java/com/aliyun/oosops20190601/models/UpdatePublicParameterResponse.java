// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class UpdatePublicParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePublicParameterResponseBody body;

    public static UpdatePublicParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicParameterResponse self = new UpdatePublicParameterResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePublicParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePublicParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePublicParameterResponse setBody(UpdatePublicParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePublicParameterResponseBody getBody() {
        return this.body;
    }

}
