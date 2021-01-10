// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeBahamutBuildconfigregistryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLinkeBahamutBuildconfigregistryResponseBody body;

    public static RemoveLinkeBahamutBuildconfigregistryResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeBahamutBuildconfigregistryResponse self = new RemoveLinkeBahamutBuildconfigregistryResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeBahamutBuildconfigregistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLinkeBahamutBuildconfigregistryResponse setBody(RemoveLinkeBahamutBuildconfigregistryResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLinkeBahamutBuildconfigregistryResponseBody getBody() {
        return this.body;
    }

}
