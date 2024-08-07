// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryCopilotEmbedConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCopilotEmbedConfigResponseBody body;

    public static QueryCopilotEmbedConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCopilotEmbedConfigResponse self = new QueryCopilotEmbedConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryCopilotEmbedConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCopilotEmbedConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCopilotEmbedConfigResponse setBody(QueryCopilotEmbedConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCopilotEmbedConfigResponseBody getBody() {
        return this.body;
    }

}
