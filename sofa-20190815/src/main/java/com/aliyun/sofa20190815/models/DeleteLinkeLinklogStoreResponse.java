// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinklogStoreResponseBody body;

    public static DeleteLinkeLinklogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogStoreResponse self = new DeleteLinkeLinklogStoreResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinklogStoreResponse setBody(DeleteLinkeLinklogStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinklogStoreResponseBody getBody() {
        return this.body;
    }

}
