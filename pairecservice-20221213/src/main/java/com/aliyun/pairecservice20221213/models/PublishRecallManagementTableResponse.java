// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class PublishRecallManagementTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishRecallManagementTableResponseBody body;

    public static PublishRecallManagementTableResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishRecallManagementTableResponse self = new PublishRecallManagementTableResponse();
        return TeaModel.build(map, self);
    }

    public PublishRecallManagementTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishRecallManagementTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishRecallManagementTableResponse setBody(PublishRecallManagementTableResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishRecallManagementTableResponseBody getBody() {
        return this.body;
    }

}
