// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCFlowRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLDCFlowRecordResponseBody body;

    public static QueryLDCFlowRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCFlowRecordResponse self = new QueryLDCFlowRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryLDCFlowRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLDCFlowRecordResponse setBody(QueryLDCFlowRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLDCFlowRecordResponseBody getBody() {
        return this.body;
    }

}
