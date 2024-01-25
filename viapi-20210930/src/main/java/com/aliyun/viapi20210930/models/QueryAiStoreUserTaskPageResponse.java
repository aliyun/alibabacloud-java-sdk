// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class QueryAiStoreUserTaskPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryAiStoreUserTaskPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAiStoreUserTaskPageResponse setBody(QueryAiStoreUserTaskPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAiStoreUserTaskPageResponseBody getBody() {
        return this.body;
    }

}
