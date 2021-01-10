// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCurrentuserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutCurrentuserResponseBody body;

    public static GetLinkeBahamutCurrentuserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCurrentuserResponse self = new GetLinkeBahamutCurrentuserResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCurrentuserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutCurrentuserResponse setBody(GetLinkeBahamutCurrentuserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutCurrentuserResponseBody getBody() {
        return this.body;
    }

}
