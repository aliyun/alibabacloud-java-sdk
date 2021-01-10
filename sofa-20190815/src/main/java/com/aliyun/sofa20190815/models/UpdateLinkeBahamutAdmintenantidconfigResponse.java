// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdmintenantidconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutAdmintenantidconfigResponseBody body;

    public static UpdateLinkeBahamutAdmintenantidconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdmintenantidconfigResponse self = new UpdateLinkeBahamutAdmintenantidconfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdmintenantidconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutAdmintenantidconfigResponse setBody(UpdateLinkeBahamutAdmintenantidconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutAdmintenantidconfigResponseBody getBody() {
        return this.body;
    }

}
