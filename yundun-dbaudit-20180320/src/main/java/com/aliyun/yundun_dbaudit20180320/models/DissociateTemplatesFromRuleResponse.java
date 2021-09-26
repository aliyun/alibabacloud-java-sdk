// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DissociateTemplatesFromRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DissociateTemplatesFromRuleResponseBody body;

    public static DissociateTemplatesFromRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateTemplatesFromRuleResponse self = new DissociateTemplatesFromRuleResponse();
        return TeaModel.build(map, self);
    }

    public DissociateTemplatesFromRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateTemplatesFromRuleResponse setBody(DissociateTemplatesFromRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateTemplatesFromRuleResponseBody getBody() {
        return this.body;
    }

}
