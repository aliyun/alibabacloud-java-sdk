// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetcomponentresultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutWebapigetcomponentresultResponseBody body;

    public static GetLinkeBahamutWebapigetcomponentresultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetcomponentresultResponse self = new GetLinkeBahamutWebapigetcomponentresultResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetcomponentresultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutWebapigetcomponentresultResponse setBody(GetLinkeBahamutWebapigetcomponentresultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutWebapigetcomponentresultResponseBody getBody() {
        return this.body;
    }

}
