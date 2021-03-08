// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWatermarkResponseBody body;

    public static GetWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkResponse self = new GetWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public GetWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWatermarkResponse setBody(GetWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWatermarkResponseBody getBody() {
        return this.body;
    }

}
