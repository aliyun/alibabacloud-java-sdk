// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetFirstFrameDelayDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFirstFrameDelayDataResponseBody body;

    public static GetFirstFrameDelayDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFirstFrameDelayDataResponse self = new GetFirstFrameDelayDataResponse();
        return TeaModel.build(map, self);
    }

    public GetFirstFrameDelayDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFirstFrameDelayDataResponse setBody(GetFirstFrameDelayDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFirstFrameDelayDataResponseBody getBody() {
        return this.body;
    }

}
