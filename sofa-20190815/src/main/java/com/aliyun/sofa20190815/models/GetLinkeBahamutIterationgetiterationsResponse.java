// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetiterationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationgetiterationsResponseBody body;

    public static GetLinkeBahamutIterationgetiterationsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetiterationsResponse self = new GetLinkeBahamutIterationgetiterationsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetiterationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationgetiterationsResponse setBody(GetLinkeBahamutIterationgetiterationsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationgetiterationsResponseBody getBody() {
        return this.body;
    }

}
