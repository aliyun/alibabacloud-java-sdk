// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUnionSumChannelDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUnionSumChannelDataResponseBody body;

    public static QueryUnionSumChannelDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionSumChannelDataResponse self = new QueryUnionSumChannelDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnionSumChannelDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUnionSumChannelDataResponse setBody(QueryUnionSumChannelDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUnionSumChannelDataResponseBody getBody() {
        return this.body;
    }

}
