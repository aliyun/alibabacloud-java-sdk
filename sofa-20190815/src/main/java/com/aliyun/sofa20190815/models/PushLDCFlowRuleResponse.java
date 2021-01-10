// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushLDCFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushLDCFlowRuleResponseBody body;

    public static PushLDCFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PushLDCFlowRuleResponse self = new PushLDCFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public PushLDCFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushLDCFlowRuleResponse setBody(PushLDCFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PushLDCFlowRuleResponseBody getBody() {
        return this.body;
    }

}
