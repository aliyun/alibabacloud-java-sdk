// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCurrentuserswitchontrialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutCurrentuserswitchontrialResponseBody body;

    public static GetLinkeBahamutCurrentuserswitchontrialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCurrentuserswitchontrialResponse self = new GetLinkeBahamutCurrentuserswitchontrialResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCurrentuserswitchontrialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutCurrentuserswitchontrialResponse setBody(GetLinkeBahamutCurrentuserswitchontrialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutCurrentuserswitchontrialResponseBody getBody() {
        return this.body;
    }

}
