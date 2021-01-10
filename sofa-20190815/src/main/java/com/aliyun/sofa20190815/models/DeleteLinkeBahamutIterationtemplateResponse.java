// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutIterationtemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutIterationtemplateResponseBody body;

    public static DeleteLinkeBahamutIterationtemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutIterationtemplateResponse self = new DeleteLinkeBahamutIterationtemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutIterationtemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutIterationtemplateResponse setBody(DeleteLinkeBahamutIterationtemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutIterationtemplateResponseBody getBody() {
        return this.body;
    }

}
