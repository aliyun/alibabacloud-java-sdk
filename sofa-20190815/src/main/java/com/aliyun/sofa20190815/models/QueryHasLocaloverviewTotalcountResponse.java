// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasLocaloverviewTotalcountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasLocaloverviewTotalcountResponseBody body;

    public static QueryHasLocaloverviewTotalcountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasLocaloverviewTotalcountResponse self = new QueryHasLocaloverviewTotalcountResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasLocaloverviewTotalcountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasLocaloverviewTotalcountResponse setBody(QueryHasLocaloverviewTotalcountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasLocaloverviewTotalcountResponseBody getBody() {
        return this.body;
    }

}
