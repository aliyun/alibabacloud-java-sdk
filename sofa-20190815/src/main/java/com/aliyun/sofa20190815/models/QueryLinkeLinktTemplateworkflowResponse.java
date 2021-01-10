// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktTemplateworkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktTemplateworkflowResponseBody body;

    public static QueryLinkeLinktTemplateworkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktTemplateworkflowResponse self = new QueryLinkeLinktTemplateworkflowResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktTemplateworkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktTemplateworkflowResponse setBody(QueryLinkeLinktTemplateworkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktTemplateworkflowResponseBody getBody() {
        return this.body;
    }

}
