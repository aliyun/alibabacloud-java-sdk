// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinklogTagResponseBody body;

    public static DeleteLinkeLinklogTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogTagResponse self = new DeleteLinkeLinklogTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinklogTagResponse setBody(DeleteLinkeLinklogTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinklogTagResponseBody getBody() {
        return this.body;
    }

}
