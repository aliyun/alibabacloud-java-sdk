// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutAdminiterationtemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeBahamutAdminiterationtemplateResponseBody body;

    public static SaveLinkeBahamutAdminiterationtemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutAdminiterationtemplateResponse self = new SaveLinkeBahamutAdminiterationtemplateResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutAdminiterationtemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeBahamutAdminiterationtemplateResponse setBody(SaveLinkeBahamutAdminiterationtemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeBahamutAdminiterationtemplateResponseBody getBody() {
        return this.body;
    }

}
