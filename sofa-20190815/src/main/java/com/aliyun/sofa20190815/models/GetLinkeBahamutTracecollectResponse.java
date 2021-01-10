// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTracecollectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutTracecollectResponseBody body;

    public static GetLinkeBahamutTracecollectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTracecollectResponse self = new GetLinkeBahamutTracecollectResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTracecollectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutTracecollectResponse setBody(GetLinkeBahamutTracecollectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutTracecollectResponseBody getBody() {
        return this.body;
    }

}
