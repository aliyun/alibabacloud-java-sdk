// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskRuleCyclesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskRuleCyclesResponseBody body;

    public static ListClriskRuleCyclesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskRuleCyclesResponse self = new ListClriskRuleCyclesResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskRuleCyclesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskRuleCyclesResponse setBody(ListClriskRuleCyclesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskRuleCyclesResponseBody getBody() {
        return this.body;
    }

}
