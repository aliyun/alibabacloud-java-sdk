// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutSamecodereporecommendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutSamecodereporecommendResponseBody body;

    public static GetLinkeBahamutSamecodereporecommendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutSamecodereporecommendResponse self = new GetLinkeBahamutSamecodereporecommendResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutSamecodereporecommendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutSamecodereporecommendResponse setBody(GetLinkeBahamutSamecodereporecommendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutSamecodereporecommendResponseBody getBody() {
        return this.body;
    }

}
