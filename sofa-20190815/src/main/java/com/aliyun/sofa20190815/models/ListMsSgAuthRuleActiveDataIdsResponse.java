// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuthRuleActiveDataIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgAuthRuleActiveDataIdsResponseBody body;

    public static ListMsSgAuthRuleActiveDataIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuthRuleActiveDataIdsResponse self = new ListMsSgAuthRuleActiveDataIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuthRuleActiveDataIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgAuthRuleActiveDataIdsResponse setBody(ListMsSgAuthRuleActiveDataIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgAuthRuleActiveDataIdsResponseBody getBody() {
        return this.body;
    }

}
