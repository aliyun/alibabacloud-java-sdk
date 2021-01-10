// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdmincommonuseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutAdmincommonuseResponseBody body;

    public static AddLinkeBahamutAdmincommonuseResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdmincommonuseResponse self = new AddLinkeBahamutAdmincommonuseResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdmincommonuseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutAdmincommonuseResponse setBody(AddLinkeBahamutAdmincommonuseResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutAdmincommonuseResponseBody getBody() {
        return this.body;
    }

}
