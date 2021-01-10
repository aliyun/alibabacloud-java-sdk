// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternalworkitemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAoneinternalworkitemResponseBody body;

    public static GetLinkeBahamutAoneinternalworkitemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternalworkitemResponse self = new GetLinkeBahamutAoneinternalworkitemResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternalworkitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAoneinternalworkitemResponse setBody(GetLinkeBahamutAoneinternalworkitemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAoneinternalworkitemResponseBody getBody() {
        return this.body;
    }

}
