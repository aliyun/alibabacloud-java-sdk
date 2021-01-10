// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminsecretdicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutAdminsecretdicResponseBody body;

    public static AddLinkeBahamutAdminsecretdicResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminsecretdicResponse self = new AddLinkeBahamutAdminsecretdicResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminsecretdicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutAdminsecretdicResponse setBody(AddLinkeBahamutAdminsecretdicResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutAdminsecretdicResponseBody getBody() {
        return this.body;
    }

}
