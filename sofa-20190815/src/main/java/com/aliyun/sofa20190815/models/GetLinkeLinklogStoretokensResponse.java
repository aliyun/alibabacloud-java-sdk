// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogStoretokensResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinklogStoretokensResponseBody body;

    public static GetLinkeLinklogStoretokensResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogStoretokensResponse self = new GetLinkeLinklogStoretokensResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogStoretokensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinklogStoretokensResponse setBody(GetLinkeLinklogStoretokensResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinklogStoretokensResponseBody getBody() {
        return this.body;
    }

}
