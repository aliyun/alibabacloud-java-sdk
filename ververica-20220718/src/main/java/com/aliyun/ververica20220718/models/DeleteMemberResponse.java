// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMemberResponseBody body;

    public static DeleteMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemberResponse self = new DeleteMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMemberResponse setBody(DeleteMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMemberResponseBody getBody() {
        return this.body;
    }

}
