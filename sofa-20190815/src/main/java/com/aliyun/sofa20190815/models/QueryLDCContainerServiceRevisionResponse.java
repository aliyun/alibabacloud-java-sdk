// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCContainerServiceRevisionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLDCContainerServiceRevisionResponseBody body;

    public static QueryLDCContainerServiceRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCContainerServiceRevisionResponse self = new QueryLDCContainerServiceRevisionResponse();
        return TeaModel.build(map, self);
    }

    public QueryLDCContainerServiceRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLDCContainerServiceRevisionResponse setBody(QueryLDCContainerServiceRevisionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLDCContainerServiceRevisionResponseBody getBody() {
        return this.body;
    }

}
