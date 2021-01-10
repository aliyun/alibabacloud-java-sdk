// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectImagetaskdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectImagetaskdetailResponseBody body;

    public static QueryHasInspectImagetaskdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectImagetaskdetailResponse self = new QueryHasInspectImagetaskdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectImagetaskdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectImagetaskdetailResponse setBody(QueryHasInspectImagetaskdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectImagetaskdetailResponseBody getBody() {
        return this.body;
    }

}
