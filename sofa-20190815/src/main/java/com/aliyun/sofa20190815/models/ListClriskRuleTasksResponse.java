// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskRuleTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskRuleTasksResponseBody body;

    public static ListClriskRuleTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskRuleTasksResponse self = new ListClriskRuleTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskRuleTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskRuleTasksResponse setBody(ListClriskRuleTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskRuleTasksResponseBody getBody() {
        return this.body;
    }

}
