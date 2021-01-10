// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectRuleofmissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectRuleofmissionResponseBody body;

    public static QueryHasInspectRuleofmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectRuleofmissionResponse self = new QueryHasInspectRuleofmissionResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectRuleofmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectRuleofmissionResponse setBody(QueryHasInspectRuleofmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectRuleofmissionResponseBody getBody() {
        return this.body;
    }

}
