// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXAppsBiztypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDTXAppsBiztypeResponseBody body;

    public static GetDTXAppsBiztypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDTXAppsBiztypeResponse self = new GetDTXAppsBiztypeResponse();
        return TeaModel.build(map, self);
    }

    public GetDTXAppsBiztypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDTXAppsBiztypeResponse setBody(GetDTXAppsBiztypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDTXAppsBiztypeResponseBody getBody() {
        return this.body;
    }

}
