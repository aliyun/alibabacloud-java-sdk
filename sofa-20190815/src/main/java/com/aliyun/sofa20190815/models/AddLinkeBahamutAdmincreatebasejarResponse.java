// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdmincreatebasejarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutAdmincreatebasejarResponseBody body;

    public static AddLinkeBahamutAdmincreatebasejarResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdmincreatebasejarResponse self = new AddLinkeBahamutAdmincreatebasejarResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdmincreatebasejarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutAdmincreatebasejarResponse setBody(AddLinkeBahamutAdmincreatebasejarResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutAdmincreatebasejarResponseBody getBody() {
        return this.body;
    }

}
