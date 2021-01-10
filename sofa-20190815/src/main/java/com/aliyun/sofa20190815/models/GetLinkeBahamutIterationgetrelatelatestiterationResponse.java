// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetrelatelatestiterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationgetrelatelatestiterationResponseBody body;

    public static GetLinkeBahamutIterationgetrelatelatestiterationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetrelatelatestiterationResponse self = new GetLinkeBahamutIterationgetrelatelatestiterationResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetrelatelatestiterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationgetrelatelatestiterationResponse setBody(GetLinkeBahamutIterationgetrelatelatestiterationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationgetrelatelatestiterationResponseBody getBody() {
        return this.body;
    }

}
