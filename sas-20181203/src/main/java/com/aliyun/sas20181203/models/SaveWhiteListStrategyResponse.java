// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveWhiteListStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveWhiteListStrategyResponseBody body;

    public static SaveWhiteListStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveWhiteListStrategyResponse self = new SaveWhiteListStrategyResponse();
        return TeaModel.build(map, self);
    }

    public SaveWhiteListStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveWhiteListStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveWhiteListStrategyResponse setBody(SaveWhiteListStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveWhiteListStrategyResponseBody getBody() {
        return this.body;
    }

}
