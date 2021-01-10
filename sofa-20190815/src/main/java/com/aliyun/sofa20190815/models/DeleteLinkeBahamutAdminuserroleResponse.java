// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAdminuserroleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutAdminuserroleResponseBody body;

    public static DeleteLinkeBahamutAdminuserroleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAdminuserroleResponse self = new DeleteLinkeBahamutAdminuserroleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAdminuserroleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutAdminuserroleResponse setBody(DeleteLinkeBahamutAdminuserroleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutAdminuserroleResponseBody getBody() {
        return this.body;
    }

}
