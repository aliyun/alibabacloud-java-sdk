// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class RecoverIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoverIndexResponseBody body;

    public static RecoverIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverIndexResponse self = new RecoverIndexResponse();
        return TeaModel.build(map, self);
    }

    public RecoverIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverIndexResponse setBody(RecoverIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverIndexResponseBody getBody() {
        return this.body;
    }

}
