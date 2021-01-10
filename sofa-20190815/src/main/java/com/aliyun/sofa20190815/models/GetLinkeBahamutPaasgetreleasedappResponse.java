// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPaasgetreleasedappResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPaasgetreleasedappResponseBody body;

    public static GetLinkeBahamutPaasgetreleasedappResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPaasgetreleasedappResponse self = new GetLinkeBahamutPaasgetreleasedappResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPaasgetreleasedappResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPaasgetreleasedappResponse setBody(GetLinkeBahamutPaasgetreleasedappResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPaasgetreleasedappResponseBody getBody() {
        return this.body;
    }

}
