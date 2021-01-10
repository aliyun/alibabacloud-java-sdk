// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskRuleRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskRuleRecordsResponseBody body;

    public static ListClriskRuleRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskRuleRecordsResponse self = new ListClriskRuleRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskRuleRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskRuleRecordsResponse setBody(ListClriskRuleRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskRuleRecordsResponseBody getBody() {
        return this.body;
    }

}
