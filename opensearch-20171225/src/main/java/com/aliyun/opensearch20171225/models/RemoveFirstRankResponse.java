// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveFirstRankResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveFirstRankResponseBody body;

    public static RemoveFirstRankResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveFirstRankResponse self = new RemoveFirstRankResponse();
        return TeaModel.build(map, self);
    }

    public RemoveFirstRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveFirstRankResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveFirstRankResponse setBody(RemoveFirstRankResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveFirstRankResponseBody getBody() {
        return this.body;
    }

}
