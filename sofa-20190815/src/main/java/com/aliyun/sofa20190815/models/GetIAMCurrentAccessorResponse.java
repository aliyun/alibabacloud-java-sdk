// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetIAMCurrentAccessorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIAMCurrentAccessorResponseBody body;

    public static GetIAMCurrentAccessorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIAMCurrentAccessorResponse self = new GetIAMCurrentAccessorResponse();
        return TeaModel.build(map, self);
    }

    public GetIAMCurrentAccessorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIAMCurrentAccessorResponse setBody(GetIAMCurrentAccessorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIAMCurrentAccessorResponseBody getBody() {
        return this.body;
    }

}
