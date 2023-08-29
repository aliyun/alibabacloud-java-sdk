// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class PublishFeatureViewTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PublishFeatureViewTableResponseBody body;

    public static PublishFeatureViewTableResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishFeatureViewTableResponse self = new PublishFeatureViewTableResponse();
        return TeaModel.build(map, self);
    }

    public PublishFeatureViewTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishFeatureViewTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishFeatureViewTableResponse setBody(PublishFeatureViewTableResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishFeatureViewTableResponseBody getBody() {
        return this.body;
    }

}
