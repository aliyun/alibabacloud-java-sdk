// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDTXBizTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDTXBizTypeResponseBody body;

    public static QueryDTXBizTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDTXBizTypeResponse self = new QueryDTXBizTypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryDTXBizTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDTXBizTypeResponse setBody(QueryDTXBizTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDTXBizTypeResponseBody getBody() {
        return this.body;
    }

}
