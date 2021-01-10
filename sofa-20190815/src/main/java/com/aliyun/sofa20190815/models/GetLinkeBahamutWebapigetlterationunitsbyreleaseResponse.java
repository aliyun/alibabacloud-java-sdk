// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutWebapigetlterationunitsbyreleaseResponseBody body;

    public static GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse self = new GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse setBody(GetLinkeBahamutWebapigetlterationunitsbyreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutWebapigetlterationunitsbyreleaseResponseBody getBody() {
        return this.body;
    }

}
