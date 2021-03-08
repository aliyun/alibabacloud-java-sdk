// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIVideoTagResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAIVideoTagResultResponseBody body;

    public static GetAIVideoTagResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIVideoTagResultResponse self = new GetAIVideoTagResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAIVideoTagResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIVideoTagResultResponse setBody(GetAIVideoTagResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIVideoTagResultResponseBody getBody() {
        return this.body;
    }

}
