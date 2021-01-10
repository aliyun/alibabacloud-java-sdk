// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDTXActionParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDTXActionParamResponseBody body;

    public static QueryDTXActionParamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDTXActionParamResponse self = new QueryDTXActionParamResponse();
        return TeaModel.build(map, self);
    }

    public QueryDTXActionParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDTXActionParamResponse setBody(QueryDTXActionParamResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDTXActionParamResponseBody getBody() {
        return this.body;
    }

}
