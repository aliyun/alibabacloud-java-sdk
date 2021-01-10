// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsSgServicesResponseBody body;

    public static QueryMsSgServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServicesResponse self = new QueryMsSgServicesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsSgServicesResponse setBody(QueryMsSgServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsSgServicesResponseBody getBody() {
        return this.body;
    }

}
