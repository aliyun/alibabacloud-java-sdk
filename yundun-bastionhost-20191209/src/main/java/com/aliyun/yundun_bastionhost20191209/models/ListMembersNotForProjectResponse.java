// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListMembersNotForProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMembersNotForProjectResponseBody body;

    public static ListMembersNotForProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMembersNotForProjectResponse self = new ListMembersNotForProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListMembersNotForProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMembersNotForProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMembersNotForProjectResponse setBody(ListMembersNotForProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMembersNotForProjectResponseBody getBody() {
        return this.body;
    }

}
