// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyIndexOnlineStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIndexOnlineStrategyResponseBody body;

    public static ModifyIndexOnlineStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIndexOnlineStrategyResponse self = new ModifyIndexOnlineStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIndexOnlineStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIndexOnlineStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIndexOnlineStrategyResponse setBody(ModifyIndexOnlineStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIndexOnlineStrategyResponseBody getBody() {
        return this.body;
    }

}
