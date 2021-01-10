// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStagebranchinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutStagebranchinfoResponseBody body;

    public static GetLinkeBahamutStagebranchinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStagebranchinfoResponse self = new GetLinkeBahamutStagebranchinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStagebranchinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutStagebranchinfoResponse setBody(GetLinkeBahamutStagebranchinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutStagebranchinfoResponseBody getBody() {
        return this.body;
    }

}
