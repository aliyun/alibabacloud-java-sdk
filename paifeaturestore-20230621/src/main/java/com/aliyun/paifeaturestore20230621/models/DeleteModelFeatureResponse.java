// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class DeleteModelFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelFeatureResponseBody body;

    public static DeleteModelFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelFeatureResponse self = new DeleteModelFeatureResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelFeatureResponse setBody(DeleteModelFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelFeatureResponseBody getBody() {
        return this.body;
    }

}
