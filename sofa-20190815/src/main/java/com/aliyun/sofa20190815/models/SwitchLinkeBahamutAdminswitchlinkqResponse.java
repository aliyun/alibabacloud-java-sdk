// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SwitchLinkeBahamutAdminswitchlinkqResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchLinkeBahamutAdminswitchlinkqResponseBody body;

    public static SwitchLinkeBahamutAdminswitchlinkqResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchLinkeBahamutAdminswitchlinkqResponse self = new SwitchLinkeBahamutAdminswitchlinkqResponse();
        return TeaModel.build(map, self);
    }

    public SwitchLinkeBahamutAdminswitchlinkqResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchLinkeBahamutAdminswitchlinkqResponse setBody(SwitchLinkeBahamutAdminswitchlinkqResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchLinkeBahamutAdminswitchlinkqResponseBody getBody() {
        return this.body;
    }

}
