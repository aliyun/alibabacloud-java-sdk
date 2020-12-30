// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpsecServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIpsecServerResponseBody body;

    public static DeleteIpsecServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpsecServerResponse self = new DeleteIpsecServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpsecServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpsecServerResponse setBody(DeleteIpsecServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpsecServerResponseBody getBody() {
        return this.body;
    }

}
