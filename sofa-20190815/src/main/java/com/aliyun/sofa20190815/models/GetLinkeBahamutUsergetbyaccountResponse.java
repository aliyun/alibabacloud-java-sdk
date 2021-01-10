// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUsergetbyaccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutUsergetbyaccountResponseBody body;

    public static GetLinkeBahamutUsergetbyaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUsergetbyaccountResponse self = new GetLinkeBahamutUsergetbyaccountResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUsergetbyaccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutUsergetbyaccountResponse setBody(GetLinkeBahamutUsergetbyaccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutUsergetbyaccountResponseBody getBody() {
        return this.body;
    }

}
