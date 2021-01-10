// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutBuildconfigregistryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeBahamutBuildconfigregistryResponseBody body;

    public static SaveLinkeBahamutBuildconfigregistryResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutBuildconfigregistryResponse self = new SaveLinkeBahamutBuildconfigregistryResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutBuildconfigregistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeBahamutBuildconfigregistryResponse setBody(SaveLinkeBahamutBuildconfigregistryResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeBahamutBuildconfigregistryResponseBody getBody() {
        return this.body;
    }

}
