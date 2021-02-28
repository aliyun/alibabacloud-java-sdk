// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DeleteScdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScdnDomainResponseBody body;

    public static DeleteScdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScdnDomainResponse self = new DeleteScdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScdnDomainResponse setBody(DeleteScdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScdnDomainResponseBody getBody() {
        return this.body;
    }

}
