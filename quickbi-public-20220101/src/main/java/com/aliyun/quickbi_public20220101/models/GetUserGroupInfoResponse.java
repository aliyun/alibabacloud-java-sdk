// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetUserGroupInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserGroupInfoResponseBody body;

    public static GetUserGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserGroupInfoResponse self = new GetUserGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUserGroupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserGroupInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserGroupInfoResponse setBody(GetUserGroupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserGroupInfoResponseBody getBody() {
        return this.body;
    }

}
