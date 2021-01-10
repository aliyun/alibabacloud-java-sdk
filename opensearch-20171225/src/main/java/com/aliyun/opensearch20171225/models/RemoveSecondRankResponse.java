// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveSecondRankResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveSecondRankResponseBody body;

    public static RemoveSecondRankResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSecondRankResponse self = new RemoveSecondRankResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSecondRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSecondRankResponse setBody(RemoveSecondRankResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSecondRankResponseBody getBody() {
        return this.body;
    }

}
