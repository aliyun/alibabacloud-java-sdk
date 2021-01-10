// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDTXBiztypeRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDTXBiztypeRelationResponseBody body;

    public static QueryDTXBiztypeRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDTXBiztypeRelationResponse self = new QueryDTXBiztypeRelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryDTXBiztypeRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDTXBiztypeRelationResponse setBody(QueryDTXBiztypeRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDTXBiztypeRelationResponseBody getBody() {
        return this.body;
    }

}
