// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAdminworkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutAdminworkspaceResponseBody body;

    public static DeleteLinkeBahamutAdminworkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAdminworkspaceResponse self = new DeleteLinkeBahamutAdminworkspaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAdminworkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutAdminworkspaceResponse setBody(DeleteLinkeBahamutAdminworkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutAdminworkspaceResponseBody getBody() {
        return this.body;
    }

}
