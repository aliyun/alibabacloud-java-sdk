// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponseBody body;

    public static DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse self = new DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse setBody(DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponseBody getBody() {
        return this.body;
    }

}
