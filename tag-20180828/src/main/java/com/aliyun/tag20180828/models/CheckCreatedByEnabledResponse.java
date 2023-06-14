// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CheckCreatedByEnabledResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckCreatedByEnabledResponseBody body;

    public static CheckCreatedByEnabledResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCreatedByEnabledResponse self = new CheckCreatedByEnabledResponse();
        return TeaModel.build(map, self);
    }

    public CheckCreatedByEnabledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCreatedByEnabledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCreatedByEnabledResponse setBody(CheckCreatedByEnabledResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCreatedByEnabledResponseBody getBody() {
        return this.body;
    }

}
