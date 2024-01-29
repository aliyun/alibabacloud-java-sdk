// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class InviteAccountToResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InviteAccountToResourceDirectoryResponseBody body;

    public static InviteAccountToResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        InviteAccountToResourceDirectoryResponse self = new InviteAccountToResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public InviteAccountToResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InviteAccountToResourceDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InviteAccountToResourceDirectoryResponse setBody(InviteAccountToResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public InviteAccountToResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
