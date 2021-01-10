// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminproductidaddmenuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutAdminproductidaddmenuResponseBody body;

    public static AddLinkeBahamutAdminproductidaddmenuResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminproductidaddmenuResponse self = new AddLinkeBahamutAdminproductidaddmenuResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminproductidaddmenuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutAdminproductidaddmenuResponse setBody(AddLinkeBahamutAdminproductidaddmenuResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutAdminproductidaddmenuResponseBody getBody() {
        return this.body;
    }

}
