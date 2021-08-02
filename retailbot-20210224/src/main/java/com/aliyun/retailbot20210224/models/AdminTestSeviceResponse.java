// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AdminTestSeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AdminTestSeviceResponseBody body;

    public static AdminTestSeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        AdminTestSeviceResponse self = new AdminTestSeviceResponse();
        return TeaModel.build(map, self);
    }

    public AdminTestSeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AdminTestSeviceResponse setBody(AdminTestSeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AdminTestSeviceResponseBody getBody() {
        return this.body;
    }

}
