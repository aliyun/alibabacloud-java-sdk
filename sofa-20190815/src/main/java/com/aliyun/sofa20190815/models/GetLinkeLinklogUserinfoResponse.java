// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogUserinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinklogUserinfoResponseBody body;

    public static GetLinkeLinklogUserinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogUserinfoResponse self = new GetLinkeLinklogUserinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogUserinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinklogUserinfoResponse setBody(GetLinkeLinklogUserinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinklogUserinfoResponseBody getBody() {
        return this.body;
    }

}
