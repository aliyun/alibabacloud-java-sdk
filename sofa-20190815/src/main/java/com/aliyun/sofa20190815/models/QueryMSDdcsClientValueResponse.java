// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsClientValueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMSDdcsClientValueResponseBody body;

    public static QueryMSDdcsClientValueResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsClientValueResponse self = new QueryMSDdcsClientValueResponse();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsClientValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMSDdcsClientValueResponse setBody(QueryMSDdcsClientValueResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMSDdcsClientValueResponseBody getBody() {
        return this.body;
    }

}
