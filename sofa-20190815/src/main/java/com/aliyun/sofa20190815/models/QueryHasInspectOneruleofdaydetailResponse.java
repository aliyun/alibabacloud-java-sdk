// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectOneruleofdaydetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectOneruleofdaydetailResponseBody body;

    public static QueryHasInspectOneruleofdaydetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectOneruleofdaydetailResponse self = new QueryHasInspectOneruleofdaydetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectOneruleofdaydetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectOneruleofdaydetailResponse setBody(QueryHasInspectOneruleofdaydetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectOneruleofdaydetailResponseBody getBody() {
        return this.body;
    }

}
