// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutAdminiterationtemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutAdminiterationtemplateResponseBody body;

    public static CreateLinkeBahamutAdminiterationtemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutAdminiterationtemplateResponse self = new CreateLinkeBahamutAdminiterationtemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutAdminiterationtemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutAdminiterationtemplateResponse setBody(CreateLinkeBahamutAdminiterationtemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutAdminiterationtemplateResponseBody getBody() {
        return this.body;
    }

}
