// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class AggregateSearchYuqingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AggregateSearchYuqingResponseBody body;

    public static AggregateSearchYuqingResponse build(java.util.Map<String, ?> map) throws Exception {
        AggregateSearchYuqingResponse self = new AggregateSearchYuqingResponse();
        return TeaModel.build(map, self);
    }

    public AggregateSearchYuqingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AggregateSearchYuqingResponse setBody(AggregateSearchYuqingResponseBody body) {
        this.body = body;
        return this;
    }
    public AggregateSearchYuqingResponseBody getBody() {
        return this.body;
    }

}
