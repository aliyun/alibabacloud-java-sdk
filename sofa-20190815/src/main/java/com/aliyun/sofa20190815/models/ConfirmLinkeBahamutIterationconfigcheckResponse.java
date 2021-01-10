// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkeBahamutIterationconfigcheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmLinkeBahamutIterationconfigcheckResponseBody body;

    public static ConfirmLinkeBahamutIterationconfigcheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkeBahamutIterationconfigcheckResponse self = new ConfirmLinkeBahamutIterationconfigcheckResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkeBahamutIterationconfigcheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmLinkeBahamutIterationconfigcheckResponse setBody(ConfirmLinkeBahamutIterationconfigcheckResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmLinkeBahamutIterationconfigcheckResponseBody getBody() {
        return this.body;
    }

}
