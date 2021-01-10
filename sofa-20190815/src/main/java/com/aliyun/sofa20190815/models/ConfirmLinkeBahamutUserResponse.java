// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkeBahamutUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmLinkeBahamutUserResponseBody body;

    public static ConfirmLinkeBahamutUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkeBahamutUserResponse self = new ConfirmLinkeBahamutUserResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkeBahamutUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmLinkeBahamutUserResponse setBody(ConfirmLinkeBahamutUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmLinkeBahamutUserResponseBody getBody() {
        return this.body;
    }

}
