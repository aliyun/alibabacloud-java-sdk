// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExecStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecStrategyResponseBody body;

    public static ExecStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecStrategyResponse self = new ExecStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ExecStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecStrategyResponse setBody(ExecStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecStrategyResponseBody getBody() {
        return this.body;
    }

}
