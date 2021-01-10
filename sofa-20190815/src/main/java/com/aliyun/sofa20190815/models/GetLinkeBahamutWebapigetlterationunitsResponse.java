// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetlterationunitsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutWebapigetlterationunitsResponseBody body;

    public static GetLinkeBahamutWebapigetlterationunitsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetlterationunitsResponse self = new GetLinkeBahamutWebapigetlterationunitsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetlterationunitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutWebapigetlterationunitsResponse setBody(GetLinkeBahamutWebapigetlterationunitsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutWebapigetlterationunitsResponseBody getBody() {
        return this.body;
    }

}
