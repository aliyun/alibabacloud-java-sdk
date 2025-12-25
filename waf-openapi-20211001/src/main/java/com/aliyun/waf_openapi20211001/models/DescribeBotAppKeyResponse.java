// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBotAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBotAppKeyResponseBody body;

    public static DescribeBotAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBotAppKeyResponse self = new DescribeBotAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBotAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBotAppKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBotAppKeyResponse setBody(DescribeBotAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBotAppKeyResponseBody getBody() {
        return this.body;
    }

}
