// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminuserroleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutAdminuserroleResponseBody body;

    public static UpdateLinkeBahamutAdminuserroleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminuserroleResponse self = new UpdateLinkeBahamutAdminuserroleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminuserroleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutAdminuserroleResponse setBody(UpdateLinkeBahamutAdminuserroleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutAdminuserroleResponseBody getBody() {
        return this.body;
    }

}
