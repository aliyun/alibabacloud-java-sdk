// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutOpeninitprsettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitLinkeBahamutOpeninitprsettingsResponseBody body;

    public static InitLinkeBahamutOpeninitprsettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutOpeninitprsettingsResponse self = new InitLinkeBahamutOpeninitprsettingsResponse();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutOpeninitprsettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitLinkeBahamutOpeninitprsettingsResponse setBody(InitLinkeBahamutOpeninitprsettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public InitLinkeBahamutOpeninitprsettingsResponseBody getBody() {
        return this.body;
    }

}
