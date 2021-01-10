// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAllattachablereleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAllattachablereleaseResponseBody body;

    public static GetLinkeBahamutAllattachablereleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAllattachablereleaseResponse self = new GetLinkeBahamutAllattachablereleaseResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAllattachablereleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAllattachablereleaseResponse setBody(GetLinkeBahamutAllattachablereleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAllattachablereleaseResponseBody getBody() {
        return this.body;
    }

}
