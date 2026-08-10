// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteContextDatabaseMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContextDatabaseMemberResponseBody body;

    public static DeleteContextDatabaseMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextDatabaseMemberResponse self = new DeleteContextDatabaseMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContextDatabaseMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContextDatabaseMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContextDatabaseMemberResponse setBody(DeleteContextDatabaseMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContextDatabaseMemberResponseBody getBody() {
        return this.body;
    }

}
