// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPaasgetappsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPaasgetappsResponseBody body;

    public static GetLinkeBahamutPaasgetappsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPaasgetappsResponse self = new GetLinkeBahamutPaasgetappsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPaasgetappsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPaasgetappsResponse setBody(GetLinkeBahamutPaasgetappsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPaasgetappsResponseBody getBody() {
        return this.body;
    }

}
