// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCOpsplanAppprogressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLDCOpsplanAppprogressResponseBody body;

    public static QueryLDCOpsplanAppprogressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCOpsplanAppprogressResponse self = new QueryLDCOpsplanAppprogressResponse();
        return TeaModel.build(map, self);
    }

    public QueryLDCOpsplanAppprogressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLDCOpsplanAppprogressResponse setBody(QueryLDCOpsplanAppprogressResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLDCOpsplanAppprogressResponseBody getBody() {
        return this.body;
    }

}
