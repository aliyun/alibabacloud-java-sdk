// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryExtensionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryExtensionAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExtensionAttributeResponse setBody(QueryExtensionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExtensionAttributeResponseBody getBody() {
        return this.body;
    }

}
