// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsbrancheResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsbrancheResponseBody body;

    public static GetLinkeBahamutVcsbrancheResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsbrancheResponse self = new GetLinkeBahamutVcsbrancheResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsbrancheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsbrancheResponse setBody(GetLinkeBahamutVcsbrancheResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsbrancheResponseBody getBody() {
        return this.body;
    }

}
