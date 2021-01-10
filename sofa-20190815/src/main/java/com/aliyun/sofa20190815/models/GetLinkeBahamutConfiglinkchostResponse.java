// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutConfiglinkchostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutConfiglinkchostResponseBody body;

    public static GetLinkeBahamutConfiglinkchostResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutConfiglinkchostResponse self = new GetLinkeBahamutConfiglinkchostResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutConfiglinkchostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutConfiglinkchostResponse setBody(GetLinkeBahamutConfiglinkchostResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutConfiglinkchostResponseBody getBody() {
        return this.body;
    }

}
