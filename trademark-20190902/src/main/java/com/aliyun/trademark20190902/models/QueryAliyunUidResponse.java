// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class QueryAliyunUidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAliyunUidResponseBody body;

    public static QueryAliyunUidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAliyunUidResponse self = new QueryAliyunUidResponse();
        return TeaModel.build(map, self);
    }

    public QueryAliyunUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAliyunUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAliyunUidResponse setBody(QueryAliyunUidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAliyunUidResponseBody getBody() {
        return this.body;
    }

}
