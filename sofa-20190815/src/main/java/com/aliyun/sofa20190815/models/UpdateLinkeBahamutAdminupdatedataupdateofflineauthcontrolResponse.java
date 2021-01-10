// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponseBody body;

    public static UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse self = new UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse setBody(UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponseBody getBody() {
        return this.body;
    }

}
