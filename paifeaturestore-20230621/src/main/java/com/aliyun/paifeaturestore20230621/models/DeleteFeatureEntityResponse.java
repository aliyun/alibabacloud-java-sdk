// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class DeleteFeatureEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFeatureEntityResponseBody body;

    public static DeleteFeatureEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFeatureEntityResponse self = new DeleteFeatureEntityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFeatureEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFeatureEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFeatureEntityResponse setBody(DeleteFeatureEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFeatureEntityResponseBody getBody() {
        return this.body;
    }

}
