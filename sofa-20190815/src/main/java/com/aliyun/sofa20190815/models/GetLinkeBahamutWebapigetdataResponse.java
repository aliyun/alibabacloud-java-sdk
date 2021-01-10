// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetdataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutWebapigetdataResponseBody body;

    public static GetLinkeBahamutWebapigetdataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetdataResponse self = new GetLinkeBahamutWebapigetdataResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetdataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutWebapigetdataResponse setBody(GetLinkeBahamutWebapigetdataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutWebapigetdataResponseBody getBody() {
        return this.body;
    }

}
