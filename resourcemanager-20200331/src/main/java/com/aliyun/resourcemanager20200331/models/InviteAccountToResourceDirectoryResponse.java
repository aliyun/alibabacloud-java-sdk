// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class InviteAccountToResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public InviteAccountToResourceDirectoryResponse setBody(InviteAccountToResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public InviteAccountToResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
