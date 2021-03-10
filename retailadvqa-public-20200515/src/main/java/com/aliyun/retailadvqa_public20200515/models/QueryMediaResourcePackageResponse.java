// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class QueryMediaResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMediaResourcePackageResponseBody body;

    public static QueryMediaResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaResourcePackageResponse self = new QueryMediaResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaResourcePackageResponse setBody(QueryMediaResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaResourcePackageResponseBody getBody() {
        return this.body;
    }

}
