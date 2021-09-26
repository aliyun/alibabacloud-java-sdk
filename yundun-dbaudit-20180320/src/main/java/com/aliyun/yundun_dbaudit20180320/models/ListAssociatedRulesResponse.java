// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListAssociatedRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAssociatedRulesResponseBody body;

    public static ListAssociatedRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssociatedRulesResponse self = new ListAssociatedRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAssociatedRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssociatedRulesResponse setBody(ListAssociatedRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssociatedRulesResponseBody getBody() {
        return this.body;
    }

}
