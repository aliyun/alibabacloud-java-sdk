// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinklogStoreResponseBody body;

    public static UpdateLinkeLinklogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogStoreResponse self = new UpdateLinkeLinklogStoreResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinklogStoreResponse setBody(UpdateLinkeLinklogStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinklogStoreResponseBody getBody() {
        return this.body;
    }

}
