// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuthRuleAppNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgAuthRuleAppNamesResponseBody body;

    public static ListMsSgAuthRuleAppNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuthRuleAppNamesResponse self = new ListMsSgAuthRuleAppNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuthRuleAppNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgAuthRuleAppNamesResponse setBody(ListMsSgAuthRuleAppNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgAuthRuleAppNamesResponseBody getBody() {
        return this.body;
    }

}
