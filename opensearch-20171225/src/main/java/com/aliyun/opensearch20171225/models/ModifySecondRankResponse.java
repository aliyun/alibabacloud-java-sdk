// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifySecondRankResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySecondRankResponseBody body;

    public static ModifySecondRankResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecondRankResponse self = new ModifySecondRankResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecondRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecondRankResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecondRankResponse setBody(ModifySecondRankResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecondRankResponseBody getBody() {
        return this.body;
    }

}
