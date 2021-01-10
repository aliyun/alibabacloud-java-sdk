// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaAllsourcefilenodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaAllsourcefilenodesResponseBody body;

    public static QueryLinkeLinkaAllsourcefilenodesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaAllsourcefilenodesResponse self = new QueryLinkeLinkaAllsourcefilenodesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaAllsourcefilenodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaAllsourcefilenodesResponse setBody(QueryLinkeLinkaAllsourcefilenodesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaAllsourcefilenodesResponseBody getBody() {
        return this.body;
    }

}
