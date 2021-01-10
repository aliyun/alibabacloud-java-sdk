// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomainiterationcountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutArchdomainiterationcountResponseBody body;

    public static GetLinkeBahamutArchdomainiterationcountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomainiterationcountResponse self = new GetLinkeBahamutArchdomainiterationcountResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomainiterationcountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutArchdomainiterationcountResponse setBody(GetLinkeBahamutArchdomainiterationcountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutArchdomainiterationcountResponseBody getBody() {
        return this.body;
    }

}
