// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceSubscribersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsSgServiceSubscribersResponseBody body;

    public static QueryMsSgServiceSubscribersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceSubscribersResponse self = new QueryMsSgServiceSubscribersResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceSubscribersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsSgServiceSubscribersResponse setBody(QueryMsSgServiceSubscribersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsSgServiceSubscribersResponseBody getBody() {
        return this.body;
    }

}
