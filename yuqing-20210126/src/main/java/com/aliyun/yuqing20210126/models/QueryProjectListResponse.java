// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryProjectListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryProjectListResponseBody body;

    public static QueryProjectListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectListResponse self = new QueryProjectListResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProjectListResponse setBody(QueryProjectListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProjectListResponseBody getBody() {
        return this.body;
    }

}
