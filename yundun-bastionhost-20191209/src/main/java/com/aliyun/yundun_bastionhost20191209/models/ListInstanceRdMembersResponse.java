// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListInstanceRdMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceRdMembersResponseBody body;

    public static ListInstanceRdMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRdMembersResponse self = new ListInstanceRdMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceRdMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceRdMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceRdMembersResponse setBody(ListInstanceRdMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceRdMembersResponseBody getBody() {
        return this.body;
    }

}
