// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationunitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationunitResponseBody body;

    public static GetLinkeBahamutIterationunitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationunitResponse self = new GetLinkeBahamutIterationunitResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationunitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationunitResponse setBody(GetLinkeBahamutIterationunitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationunitResponseBody getBody() {
        return this.body;
    }

}
