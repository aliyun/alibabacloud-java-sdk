// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminuserroleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutAdminuserroleResponseBody body;

    public static AddLinkeBahamutAdminuserroleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminuserroleResponse self = new AddLinkeBahamutAdminuserroleResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminuserroleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutAdminuserroleResponse setBody(AddLinkeBahamutAdminuserroleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutAdminuserroleResponseBody getBody() {
        return this.body;
    }

}
