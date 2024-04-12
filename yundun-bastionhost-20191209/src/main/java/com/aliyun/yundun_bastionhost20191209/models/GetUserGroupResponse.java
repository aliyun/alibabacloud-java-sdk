// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserGroupResponseBody body;

    public static GetUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserGroupResponse self = new GetUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserGroupResponse setBody(GetUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserGroupResponseBody getBody() {
        return this.body;
    }

}
