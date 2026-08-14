// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachMembersFromProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachMembersFromProjectResponseBody body;

    public static DetachMembersFromProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachMembersFromProjectResponse self = new DetachMembersFromProjectResponse();
        return TeaModel.build(map, self);
    }

    public DetachMembersFromProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachMembersFromProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachMembersFromProjectResponse setBody(DetachMembersFromProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachMembersFromProjectResponseBody getBody() {
        return this.body;
    }

}
