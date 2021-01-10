// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdmintenantiditerationtemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutAdmintenantiditerationtemplateResponseBody body;

    public static AddLinkeBahamutAdmintenantiditerationtemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdmintenantiditerationtemplateResponse self = new AddLinkeBahamutAdmintenantiditerationtemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateResponse setBody(AddLinkeBahamutAdmintenantiditerationtemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutAdmintenantiditerationtemplateResponseBody getBody() {
        return this.body;
    }

}
