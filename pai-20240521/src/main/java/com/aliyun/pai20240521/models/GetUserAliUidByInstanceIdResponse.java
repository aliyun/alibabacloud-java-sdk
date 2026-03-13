// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai20240521.models;

import com.aliyun.tea.*;

public class GetUserAliUidByInstanceIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserAliUidByInstanceIdResponseBody body;

    public static GetUserAliUidByInstanceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserAliUidByInstanceIdResponse self = new GetUserAliUidByInstanceIdResponse();
        return TeaModel.build(map, self);
    }

    public GetUserAliUidByInstanceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserAliUidByInstanceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserAliUidByInstanceIdResponse setBody(GetUserAliUidByInstanceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserAliUidByInstanceIdResponseBody getBody() {
        return this.body;
    }

}
