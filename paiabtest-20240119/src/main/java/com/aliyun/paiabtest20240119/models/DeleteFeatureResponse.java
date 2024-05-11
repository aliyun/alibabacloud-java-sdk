// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class DeleteFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFeatureResponseBody body;

    public static DeleteFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFeatureResponse self = new DeleteFeatureResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFeatureResponse setBody(DeleteFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFeatureResponseBody getBody() {
        return this.body;
    }

}
