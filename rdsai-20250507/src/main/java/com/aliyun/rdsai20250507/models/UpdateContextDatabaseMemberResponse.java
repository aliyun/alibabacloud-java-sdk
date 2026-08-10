// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContextDatabaseMemberResponseBody body;

    public static UpdateContextDatabaseMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseMemberResponse self = new UpdateContextDatabaseMemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContextDatabaseMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContextDatabaseMemberResponse setBody(UpdateContextDatabaseMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContextDatabaseMemberResponseBody getBody() {
        return this.body;
    }

}
