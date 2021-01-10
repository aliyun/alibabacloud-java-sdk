// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServicePubRelationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsSgServicePubRelationsResponseBody body;

    public static QueryMsSgServicePubRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServicePubRelationsResponse self = new QueryMsSgServicePubRelationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServicePubRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsSgServicePubRelationsResponse setBody(QueryMsSgServicePubRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsSgServicePubRelationsResponseBody getBody() {
        return this.body;
    }

}
