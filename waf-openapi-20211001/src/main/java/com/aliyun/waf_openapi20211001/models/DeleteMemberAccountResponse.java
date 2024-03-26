// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteMemberAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMemberAccountResponseBody body;

    public static DeleteMemberAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemberAccountResponse self = new DeleteMemberAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMemberAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMemberAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMemberAccountResponse setBody(DeleteMemberAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMemberAccountResponseBody getBody() {
        return this.body;
    }

}
