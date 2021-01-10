// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinklogAccountResponseBody body;

    public static GetLinkeLinklogAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogAccountResponse self = new GetLinkeLinklogAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinklogAccountResponse setBody(GetLinkeLinklogAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinklogAccountResponseBody getBody() {
        return this.body;
    }

}
