// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutConfigResponseBody body;

    public static GetLinkeBahamutConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutConfigResponse self = new GetLinkeBahamutConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutConfigResponse setBody(GetLinkeBahamutConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutConfigResponseBody getBody() {
        return this.body;
    }

}
