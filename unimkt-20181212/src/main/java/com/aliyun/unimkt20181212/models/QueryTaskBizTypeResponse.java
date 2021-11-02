// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryTaskBizTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTaskBizTypeResponseBody body;

    public static QueryTaskBizTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskBizTypeResponse self = new QueryTaskBizTypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskBizTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskBizTypeResponse setBody(QueryTaskBizTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskBizTypeResponseBody getBody() {
        return this.body;
    }

}
