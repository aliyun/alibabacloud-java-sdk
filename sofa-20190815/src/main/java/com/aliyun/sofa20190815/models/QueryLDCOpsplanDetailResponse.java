// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCOpsplanDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLDCOpsplanDetailResponseBody body;

    public static QueryLDCOpsplanDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCOpsplanDetailResponse self = new QueryLDCOpsplanDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryLDCOpsplanDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLDCOpsplanDetailResponse setBody(QueryLDCOpsplanDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLDCOpsplanDetailResponseBody getBody() {
        return this.body;
    }

}
