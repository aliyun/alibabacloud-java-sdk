// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutEnvconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutEnvconfigResponseBody body;

    public static GetLinkeBahamutEnvconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutEnvconfigResponse self = new GetLinkeBahamutEnvconfigResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutEnvconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutEnvconfigResponse setBody(GetLinkeBahamutEnvconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutEnvconfigResponseBody getBody() {
        return this.body;
    }

}
