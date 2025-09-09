// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddInstanceRdMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddInstanceRdMemberResponseBody body;

    public static AddInstanceRdMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddInstanceRdMemberResponse self = new AddInstanceRdMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddInstanceRdMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddInstanceRdMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddInstanceRdMemberResponse setBody(AddInstanceRdMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddInstanceRdMemberResponseBody getBody() {
        return this.body;
    }

}
