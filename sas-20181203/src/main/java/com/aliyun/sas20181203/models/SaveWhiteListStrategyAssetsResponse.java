// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveWhiteListStrategyAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveWhiteListStrategyAssetsResponseBody body;

    public static SaveWhiteListStrategyAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveWhiteListStrategyAssetsResponse self = new SaveWhiteListStrategyAssetsResponse();
        return TeaModel.build(map, self);
    }

    public SaveWhiteListStrategyAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveWhiteListStrategyAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveWhiteListStrategyAssetsResponse setBody(SaveWhiteListStrategyAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveWhiteListStrategyAssetsResponseBody getBody() {
        return this.body;
    }

}
