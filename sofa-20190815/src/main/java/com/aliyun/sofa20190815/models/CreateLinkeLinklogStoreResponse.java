// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinklogStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinklogStoreResponseBody body;

    public static CreateLinkeLinklogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinklogStoreResponse self = new CreateLinkeLinklogStoreResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinklogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinklogStoreResponse setBody(CreateLinkeLinklogStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinklogStoreResponseBody getBody() {
        return this.body;
    }

}
