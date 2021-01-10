// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinklogAccessResponseBody body;

    public static DeleteLinkeLinklogAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogAccessResponse self = new DeleteLinkeLinklogAccessResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinklogAccessResponse setBody(DeleteLinkeLinklogAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinklogAccessResponseBody getBody() {
        return this.body;
    }

}
