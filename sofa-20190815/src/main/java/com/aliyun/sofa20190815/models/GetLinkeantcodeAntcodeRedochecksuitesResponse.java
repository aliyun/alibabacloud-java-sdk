// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeantcodeAntcodeRedochecksuitesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody body;

    public static GetLinkeantcodeAntcodeRedochecksuitesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeantcodeAntcodeRedochecksuitesResponse self = new GetLinkeantcodeAntcodeRedochecksuitesResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponse setBody(GetLinkeantcodeAntcodeRedochecksuitesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody getBody() {
        return this.body;
    }

}
