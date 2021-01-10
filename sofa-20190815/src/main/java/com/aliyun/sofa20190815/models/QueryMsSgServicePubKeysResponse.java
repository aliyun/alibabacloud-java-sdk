// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServicePubKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsSgServicePubKeysResponseBody body;

    public static QueryMsSgServicePubKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServicePubKeysResponse self = new QueryMsSgServicePubKeysResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServicePubKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsSgServicePubKeysResponse setBody(QueryMsSgServicePubKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsSgServicePubKeysResponseBody getBody() {
        return this.body;
    }

}
