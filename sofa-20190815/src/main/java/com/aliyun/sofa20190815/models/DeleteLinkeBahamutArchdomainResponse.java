// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutArchdomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutArchdomainResponseBody body;

    public static DeleteLinkeBahamutArchdomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutArchdomainResponse self = new DeleteLinkeBahamutArchdomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutArchdomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutArchdomainResponse setBody(DeleteLinkeBahamutArchdomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutArchdomainResponseBody getBody() {
        return this.body;
    }

}
