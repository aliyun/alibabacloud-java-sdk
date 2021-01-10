// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportLDCFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportLDCFlowRuleResponseBody body;

    public static ExportLDCFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportLDCFlowRuleResponse self = new ExportLDCFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public ExportLDCFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportLDCFlowRuleResponse setBody(ExportLDCFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportLDCFlowRuleResponseBody getBody() {
        return this.body;
    }

}
