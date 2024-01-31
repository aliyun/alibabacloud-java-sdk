// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClientConfStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClientConfStrategyResponseBody body;

    public static ModifyClientConfStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClientConfStrategyResponse self = new ModifyClientConfStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClientConfStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClientConfStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClientConfStrategyResponse setBody(ModifyClientConfStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClientConfStrategyResponseBody getBody() {
        return this.body;
    }

}
