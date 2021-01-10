// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogLogsbizinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinklogLogsbizinfoResponseBody body;

    public static GetLinkeLinklogLogsbizinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogLogsbizinfoResponse self = new GetLinkeLinklogLogsbizinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogLogsbizinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinklogLogsbizinfoResponse setBody(GetLinkeLinklogLogsbizinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinklogLogsbizinfoResponseBody getBody() {
        return this.body;
    }

}
