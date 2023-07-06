// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryTagNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTagNodesResponseBody body;

    public static QueryTagNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTagNodesResponse self = new QueryTagNodesResponse();
        return TeaModel.build(map, self);
    }

    public QueryTagNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTagNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTagNodesResponse setBody(QueryTagNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTagNodesResponseBody getBody() {
        return this.body;
    }

}
