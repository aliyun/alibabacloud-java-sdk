// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAllAppResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAllAppResourceGroupResponseBody body;

    public static QueryRmsAllAppResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAllAppResourceGroupResponse self = new QueryRmsAllAppResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAllAppResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAllAppResourceGroupResponse setBody(QueryRmsAllAppResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAllAppResourceGroupResponseBody getBody() {
        return this.body;
    }

}
