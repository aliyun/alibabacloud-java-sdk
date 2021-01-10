// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutTemplateResponseBody body;

    public static DeleteLinkeBahamutTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutTemplateResponse self = new DeleteLinkeBahamutTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutTemplateResponse setBody(DeleteLinkeBahamutTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutTemplateResponseBody getBody() {
        return this.body;
    }

}
