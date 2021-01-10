// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTasklistbyusertwoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutTasklistbyusertwoResponseBody body;

    public static GetLinkeBahamutTasklistbyusertwoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTasklistbyusertwoResponse self = new GetLinkeBahamutTasklistbyusertwoResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTasklistbyusertwoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutTasklistbyusertwoResponse setBody(GetLinkeBahamutTasklistbyusertwoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutTasklistbyusertwoResponseBody getBody() {
        return this.body;
    }

}
