// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class DeleteDomainPartByProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDomainPartByProxyResponseBody body;

    public static DeleteDomainPartByProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainPartByProxyResponse self = new DeleteDomainPartByProxyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainPartByProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDomainPartByProxyResponse setBody(DeleteDomainPartByProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDomainPartByProxyResponseBody getBody() {
        return this.body;
    }

}
