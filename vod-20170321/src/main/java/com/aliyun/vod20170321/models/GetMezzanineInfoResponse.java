// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMezzanineInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMezzanineInfoResponseBody body;

    public static GetMezzanineInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMezzanineInfoResponse self = new GetMezzanineInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMezzanineInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMezzanineInfoResponse setBody(GetMezzanineInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMezzanineInfoResponseBody getBody() {
        return this.body;
    }

}
