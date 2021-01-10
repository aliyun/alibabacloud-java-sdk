// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsRuleGroupByNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRmsRuleGroupByNameResponseBody body;

    public static DeleteRmsRuleGroupByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsRuleGroupByNameResponse self = new DeleteRmsRuleGroupByNameResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRmsRuleGroupByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRmsRuleGroupByNameResponse setBody(DeleteRmsRuleGroupByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRmsRuleGroupByNameResponseBody getBody() {
        return this.body;
    }

}
