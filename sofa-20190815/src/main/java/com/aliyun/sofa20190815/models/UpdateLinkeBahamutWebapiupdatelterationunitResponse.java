// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutWebapiupdatelterationunitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutWebapiupdatelterationunitResponseBody body;

    public static UpdateLinkeBahamutWebapiupdatelterationunitResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutWebapiupdatelterationunitResponse self = new UpdateLinkeBahamutWebapiupdatelterationunitResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutWebapiupdatelterationunitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutWebapiupdatelterationunitResponse setBody(UpdateLinkeBahamutWebapiupdatelterationunitResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutWebapiupdatelterationunitResponseBody getBody() {
        return this.body;
    }

}
