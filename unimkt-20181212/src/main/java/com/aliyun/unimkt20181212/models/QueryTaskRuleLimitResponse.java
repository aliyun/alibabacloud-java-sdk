// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryTaskRuleLimitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTaskRuleLimitResponseBody body;

    public static QueryTaskRuleLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskRuleLimitResponse self = new QueryTaskRuleLimitResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskRuleLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskRuleLimitResponse setBody(QueryTaskRuleLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskRuleLimitResponseBody getBody() {
        return this.body;
    }

}
