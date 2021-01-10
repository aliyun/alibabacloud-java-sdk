// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskRulesResponseBody body;

    public static ListClriskRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskRulesResponse self = new ListClriskRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskRulesResponse setBody(ListClriskRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskRulesResponseBody getBody() {
        return this.body;
    }

}
