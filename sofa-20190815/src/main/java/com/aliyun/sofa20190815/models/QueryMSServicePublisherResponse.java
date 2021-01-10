// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSServicePublisherResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMSServicePublisherResponseBody body;

    public static QueryMSServicePublisherResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMSServicePublisherResponse self = new QueryMSServicePublisherResponse();
        return TeaModel.build(map, self);
    }

    public QueryMSServicePublisherResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMSServicePublisherResponse setBody(QueryMSServicePublisherResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMSServicePublisherResponseBody getBody() {
        return this.body;
    }

}
