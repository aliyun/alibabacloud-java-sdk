// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasLocaloverviewTodayriskcountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasLocaloverviewTodayriskcountResponseBody body;

    public static QueryHasLocaloverviewTodayriskcountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasLocaloverviewTodayriskcountResponse self = new QueryHasLocaloverviewTodayriskcountResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasLocaloverviewTodayriskcountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasLocaloverviewTodayriskcountResponse setBody(QueryHasLocaloverviewTodayriskcountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasLocaloverviewTodayriskcountResponseBody getBody() {
        return this.body;
    }

}
