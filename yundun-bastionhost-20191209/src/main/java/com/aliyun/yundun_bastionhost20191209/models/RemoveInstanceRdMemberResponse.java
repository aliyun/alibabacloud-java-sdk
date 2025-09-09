// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveInstanceRdMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveInstanceRdMemberResponseBody body;

    public static RemoveInstanceRdMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceRdMemberResponse self = new RemoveInstanceRdMemberResponse();
        return TeaModel.build(map, self);
    }

    public RemoveInstanceRdMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveInstanceRdMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveInstanceRdMemberResponse setBody(RemoveInstanceRdMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveInstanceRdMemberResponseBody getBody() {
        return this.body;
    }

}
