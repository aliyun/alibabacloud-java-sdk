// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryTaskRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTaskRulesResponseBody body;

    public static QueryTaskRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskRulesResponse self = new QueryTaskRulesResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskRulesResponse setBody(QueryTaskRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskRulesResponseBody getBody() {
        return this.body;
    }

}
