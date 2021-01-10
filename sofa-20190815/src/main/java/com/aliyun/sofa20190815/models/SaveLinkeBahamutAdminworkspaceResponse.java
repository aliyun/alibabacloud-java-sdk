// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutAdminworkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeBahamutAdminworkspaceResponseBody body;

    public static SaveLinkeBahamutAdminworkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutAdminworkspaceResponse self = new SaveLinkeBahamutAdminworkspaceResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutAdminworkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeBahamutAdminworkspaceResponse setBody(SaveLinkeBahamutAdminworkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeBahamutAdminworkspaceResponseBody getBody() {
        return this.body;
    }

}
