// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContextDatabaseMemberResponseBody body;

    public static CreateContextDatabaseMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseMemberResponse self = new CreateContextDatabaseMemberResponse();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContextDatabaseMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContextDatabaseMemberResponse setBody(CreateContextDatabaseMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContextDatabaseMemberResponseBody getBody() {
        return this.body;
    }

}
