// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateProduceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProduceResponseBody body;

    public static UpdateProduceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProduceResponse self = new UpdateProduceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProduceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProduceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProduceResponse setBody(UpdateProduceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProduceResponseBody getBody() {
        return this.body;
    }

}
