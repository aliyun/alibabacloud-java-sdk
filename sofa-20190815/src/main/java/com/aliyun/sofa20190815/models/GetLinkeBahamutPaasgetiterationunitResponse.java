// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPaasgetiterationunitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPaasgetiterationunitResponseBody body;

    public static GetLinkeBahamutPaasgetiterationunitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPaasgetiterationunitResponse self = new GetLinkeBahamutPaasgetiterationunitResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPaasgetiterationunitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPaasgetiterationunitResponse setBody(GetLinkeBahamutPaasgetiterationunitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPaasgetiterationunitResponseBody getBody() {
        return this.body;
    }

}
