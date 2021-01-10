// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutAdminworkspacecheckdataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutAdminworkspacecheckdataResponseBody body;

    public static CheckLinkeBahamutAdminworkspacecheckdataResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutAdminworkspacecheckdataResponse self = new CheckLinkeBahamutAdminworkspacecheckdataResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutAdminworkspacecheckdataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutAdminworkspacecheckdataResponse setBody(CheckLinkeBahamutAdminworkspacecheckdataResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutAdminworkspacecheckdataResponseBody getBody() {
        return this.body;
    }

}
