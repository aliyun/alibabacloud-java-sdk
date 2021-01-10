// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSTopologyParamsResponseBody body;

    public static QueryTSTopologyParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyParamsResponse self = new QueryTSTopologyParamsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSTopologyParamsResponse setBody(QueryTSTopologyParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSTopologyParamsResponseBody getBody() {
        return this.body;
    }

}
