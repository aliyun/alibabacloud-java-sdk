// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminaddproductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutAdminaddproductResponseBody body;

    public static AddLinkeBahamutAdminaddproductResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminaddproductResponse self = new AddLinkeBahamutAdminaddproductResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminaddproductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutAdminaddproductResponse setBody(AddLinkeBahamutAdminaddproductResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutAdminaddproductResponseBody getBody() {
        return this.body;
    }

}
