// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableLinkeBahamutAdminiterationtemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableLinkeBahamutAdminiterationtemplateResponseBody body;

    public static EnableLinkeBahamutAdminiterationtemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableLinkeBahamutAdminiterationtemplateResponse self = new EnableLinkeBahamutAdminiterationtemplateResponse();
        return TeaModel.build(map, self);
    }

    public EnableLinkeBahamutAdminiterationtemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableLinkeBahamutAdminiterationtemplateResponse setBody(EnableLinkeBahamutAdminiterationtemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableLinkeBahamutAdminiterationtemplateResponseBody getBody() {
        return this.body;
    }

}
