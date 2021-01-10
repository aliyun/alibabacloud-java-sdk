// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUsergetbyaccountlistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutUsergetbyaccountlistResponseBody body;

    public static GetLinkeBahamutUsergetbyaccountlistResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUsergetbyaccountlistResponse self = new GetLinkeBahamutUsergetbyaccountlistResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUsergetbyaccountlistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutUsergetbyaccountlistResponse setBody(GetLinkeBahamutUsergetbyaccountlistResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutUsergetbyaccountlistResponseBody getBody() {
        return this.body;
    }

}
