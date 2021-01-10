// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSGFormConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsSGFormConfigResponseBody body;

    public static QueryMsSGFormConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSGFormConfigResponse self = new QueryMsSGFormConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsSGFormConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsSGFormConfigResponse setBody(QueryMsSGFormConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsSGFormConfigResponseBody getBody() {
        return this.body;
    }

}
