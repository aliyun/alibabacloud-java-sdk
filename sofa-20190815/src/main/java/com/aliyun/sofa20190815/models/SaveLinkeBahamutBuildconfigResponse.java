// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutBuildconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeBahamutBuildconfigResponseBody body;

    public static SaveLinkeBahamutBuildconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutBuildconfigResponse self = new SaveLinkeBahamutBuildconfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutBuildconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeBahamutBuildconfigResponse setBody(SaveLinkeBahamutBuildconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeBahamutBuildconfigResponseBody getBody() {
        return this.body;
    }

}
