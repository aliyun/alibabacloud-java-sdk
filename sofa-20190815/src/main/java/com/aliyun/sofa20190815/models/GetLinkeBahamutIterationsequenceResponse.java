// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationsequenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationsequenceResponseBody body;

    public static GetLinkeBahamutIterationsequenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationsequenceResponse self = new GetLinkeBahamutIterationsequenceResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationsequenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationsequenceResponse setBody(GetLinkeBahamutIterationsequenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationsequenceResponseBody getBody() {
        return this.body;
    }

}
