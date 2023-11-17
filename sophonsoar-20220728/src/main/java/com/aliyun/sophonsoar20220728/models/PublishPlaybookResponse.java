// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class PublishPlaybookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PublishPlaybookResponseBody body;

    public static PublishPlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishPlaybookResponse self = new PublishPlaybookResponse();
        return TeaModel.build(map, self);
    }

    public PublishPlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishPlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishPlaybookResponse setBody(PublishPlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishPlaybookResponseBody getBody() {
        return this.body;
    }

}
