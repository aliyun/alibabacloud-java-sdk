// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutArchdomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutArchdomainsResponseBody body;

    public static DeleteLinkeBahamutArchdomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutArchdomainsResponse self = new DeleteLinkeBahamutArchdomainsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutArchdomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutArchdomainsResponse setBody(DeleteLinkeBahamutArchdomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutArchdomainsResponseBody getBody() {
        return this.body;
    }

}
