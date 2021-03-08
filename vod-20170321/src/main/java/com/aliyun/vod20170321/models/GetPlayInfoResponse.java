// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPlayInfoResponseBody body;

    public static GetPlayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlayInfoResponse self = new GetPlayInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPlayInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPlayInfoResponse setBody(GetPlayInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPlayInfoResponseBody getBody() {
        return this.body;
    }

}
