// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutReleaseResponseBody body;

    public static DeleteLinkeBahamutReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutReleaseResponse self = new DeleteLinkeBahamutReleaseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutReleaseResponse setBody(DeleteLinkeBahamutReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutReleaseResponseBody getBody() {
        return this.body;
    }

}
