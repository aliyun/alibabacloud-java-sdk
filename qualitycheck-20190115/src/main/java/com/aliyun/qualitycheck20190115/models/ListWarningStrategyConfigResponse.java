// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListWarningStrategyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWarningStrategyConfigResponseBody body;

    public static ListWarningStrategyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWarningStrategyConfigResponse self = new ListWarningStrategyConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListWarningStrategyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWarningStrategyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWarningStrategyConfigResponse setBody(ListWarningStrategyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWarningStrategyConfigResponseBody getBody() {
        return this.body;
    }

}
