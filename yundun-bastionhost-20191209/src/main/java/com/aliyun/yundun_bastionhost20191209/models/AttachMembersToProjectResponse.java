// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachMembersToProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachMembersToProjectResponseBody body;

    public static AttachMembersToProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachMembersToProjectResponse self = new AttachMembersToProjectResponse();
        return TeaModel.build(map, self);
    }

    public AttachMembersToProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachMembersToProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachMembersToProjectResponse setBody(AttachMembersToProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachMembersToProjectResponseBody getBody() {
        return this.body;
    }

}
