// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class QueryAiStoreUserTaskPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAiStoreUserTaskPageResponseBody body;

    public static QueryAiStoreUserTaskPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAiStoreUserTaskPageResponse self = new QueryAiStoreUserTaskPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryAiStoreUserTaskPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAiStoreUserTaskPageResponse setBody(QueryAiStoreUserTaskPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAiStoreUserTaskPageResponseBody getBody() {
        return this.body;
    }

}
