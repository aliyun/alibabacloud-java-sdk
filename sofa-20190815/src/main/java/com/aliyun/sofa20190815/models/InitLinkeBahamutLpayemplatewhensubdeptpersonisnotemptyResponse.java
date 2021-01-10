// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody body;

    public static InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse self = new InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponse setBody(InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody body) {
        this.body = body;
        return this;
    }
    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody getBody() {
        return this.body;
    }

}
