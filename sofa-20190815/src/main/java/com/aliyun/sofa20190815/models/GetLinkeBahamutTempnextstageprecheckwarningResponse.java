// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTempnextstageprecheckwarningResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutTempnextstageprecheckwarningResponseBody body;

    public static GetLinkeBahamutTempnextstageprecheckwarningResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTempnextstageprecheckwarningResponse self = new GetLinkeBahamutTempnextstageprecheckwarningResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTempnextstageprecheckwarningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutTempnextstageprecheckwarningResponse setBody(GetLinkeBahamutTempnextstageprecheckwarningResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutTempnextstageprecheckwarningResponseBody getBody() {
        return this.body;
    }

}
