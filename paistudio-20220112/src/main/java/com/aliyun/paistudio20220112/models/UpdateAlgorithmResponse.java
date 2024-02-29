// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlgorithmResponseBody body;

    public static UpdateAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlgorithmResponse self = new UpdateAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlgorithmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlgorithmResponse setBody(UpdateAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlgorithmResponseBody getBody() {
        return this.body;
    }

}
