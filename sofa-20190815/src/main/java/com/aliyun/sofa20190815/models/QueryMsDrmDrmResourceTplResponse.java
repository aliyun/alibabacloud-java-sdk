// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsDrmDrmResourceTplResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsDrmDrmResourceTplResponseBody body;

    public static QueryMsDrmDrmResourceTplResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsDrmDrmResourceTplResponse self = new QueryMsDrmDrmResourceTplResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsDrmDrmResourceTplResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsDrmDrmResourceTplResponse setBody(QueryMsDrmDrmResourceTplResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsDrmDrmResourceTplResponseBody getBody() {
        return this.body;
    }

}
