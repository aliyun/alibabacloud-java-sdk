// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QueryUserProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserProfileResponseBody body;

    public static QueryUserProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserProfileResponse self = new QueryUserProfileResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserProfileResponse setBody(QueryUserProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserProfileResponseBody getBody() {
        return this.body;
    }

}
