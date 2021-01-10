// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMSServiceResponseBody body;

    public static QueryMSServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMSServiceResponse self = new QueryMSServiceResponse();
        return TeaModel.build(map, self);
    }

    public QueryMSServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMSServiceResponse setBody(QueryMSServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMSServiceResponseBody getBody() {
        return this.body;
    }

}
