// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAclinkelibhostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAclinkelibhostResponseBody body;

    public static GetLinkeBahamutAclinkelibhostResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAclinkelibhostResponse self = new GetLinkeBahamutAclinkelibhostResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAclinkelibhostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAclinkelibhostResponse setBody(GetLinkeBahamutAclinkelibhostResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAclinkelibhostResponseBody getBody() {
        return this.body;
    }

}
