// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class DeleteDomainPartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDomainPartResponseBody body;

    public static DeleteDomainPartResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainPartResponse self = new DeleteDomainPartResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainPartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDomainPartResponse setBody(DeleteDomainPartResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDomainPartResponseBody getBody() {
        return this.body;
    }

}
