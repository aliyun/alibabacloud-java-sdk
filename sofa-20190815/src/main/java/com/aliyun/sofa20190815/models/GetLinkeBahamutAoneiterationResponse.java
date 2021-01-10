// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneiterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAoneiterationResponseBody body;

    public static GetLinkeBahamutAoneiterationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneiterationResponse self = new GetLinkeBahamutAoneiterationResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneiterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAoneiterationResponse setBody(GetLinkeBahamutAoneiterationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAoneiterationResponseBody getBody() {
        return this.body;
    }

}
