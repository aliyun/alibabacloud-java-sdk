// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasEmergencyOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasEmergencyOrderResponseBody body;

    public static QueryHasEmergencyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasEmergencyOrderResponse self = new QueryHasEmergencyOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasEmergencyOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasEmergencyOrderResponse setBody(QueryHasEmergencyOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasEmergencyOrderResponseBody getBody() {
        return this.body;
    }

}
