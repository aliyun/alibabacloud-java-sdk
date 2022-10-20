// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListWarningConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListWarningConfigResponseBody body;

    public static ListWarningConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWarningConfigResponse self = new ListWarningConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListWarningConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWarningConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWarningConfigResponse setBody(ListWarningConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWarningConfigResponseBody getBody() {
        return this.body;
    }

}
