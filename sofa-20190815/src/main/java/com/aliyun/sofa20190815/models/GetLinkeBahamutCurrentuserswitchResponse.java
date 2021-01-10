// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCurrentuserswitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutCurrentuserswitchResponseBody body;

    public static GetLinkeBahamutCurrentuserswitchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCurrentuserswitchResponse self = new GetLinkeBahamutCurrentuserswitchResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCurrentuserswitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutCurrentuserswitchResponse setBody(GetLinkeBahamutCurrentuserswitchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutCurrentuserswitchResponseBody getBody() {
        return this.body;
    }

}
