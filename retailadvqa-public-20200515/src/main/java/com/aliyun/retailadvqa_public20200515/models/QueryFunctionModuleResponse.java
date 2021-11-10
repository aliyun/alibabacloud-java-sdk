// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class QueryFunctionModuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFunctionModuleResponseBody body;

    public static QueryFunctionModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFunctionModuleResponse self = new QueryFunctionModuleResponse();
        return TeaModel.build(map, self);
    }

    public QueryFunctionModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFunctionModuleResponse setBody(QueryFunctionModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFunctionModuleResponseBody getBody() {
        return this.body;
    }

}
