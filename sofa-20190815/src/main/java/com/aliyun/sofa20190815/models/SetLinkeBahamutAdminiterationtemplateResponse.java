// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutAdminiterationtemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLinkeBahamutAdminiterationtemplateResponseBody body;

    public static SetLinkeBahamutAdminiterationtemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutAdminiterationtemplateResponse self = new SetLinkeBahamutAdminiterationtemplateResponse();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutAdminiterationtemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLinkeBahamutAdminiterationtemplateResponse setBody(SetLinkeBahamutAdminiterationtemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLinkeBahamutAdminiterationtemplateResponseBody getBody() {
        return this.body;
    }

}
