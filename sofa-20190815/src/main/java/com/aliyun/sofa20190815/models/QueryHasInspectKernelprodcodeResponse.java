// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectKernelprodcodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectKernelprodcodeResponseBody body;

    public static QueryHasInspectKernelprodcodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectKernelprodcodeResponse self = new QueryHasInspectKernelprodcodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectKernelprodcodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectKernelprodcodeResponse setBody(QueryHasInspectKernelprodcodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectKernelprodcodeResponseBody getBody() {
        return this.body;
    }

}
