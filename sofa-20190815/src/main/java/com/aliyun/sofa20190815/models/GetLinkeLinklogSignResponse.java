// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinklogSignResponseBody body;

    public static GetLinkeLinklogSignResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogSignResponse self = new GetLinkeLinklogSignResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinklogSignResponse setBody(GetLinkeLinklogSignResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinklogSignResponseBody getBody() {
        return this.body;
    }

}
