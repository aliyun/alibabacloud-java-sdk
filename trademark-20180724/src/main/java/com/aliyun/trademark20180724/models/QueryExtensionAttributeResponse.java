// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryExtensionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExtensionAttributeResponseBody body;

    public static QueryExtensionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExtensionAttributeResponse self = new QueryExtensionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public QueryExtensionAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExtensionAttributeResponse setBody(QueryExtensionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExtensionAttributeResponseBody getBody() {
        return this.body;
    }

}
