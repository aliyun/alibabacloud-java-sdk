// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinklogStoreResponseBody body;

    public static GetLinkeLinklogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogStoreResponse self = new GetLinkeLinklogStoreResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinklogStoreResponse setBody(GetLinkeLinklogStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinklogStoreResponseBody getBody() {
        return this.body;
    }

}
