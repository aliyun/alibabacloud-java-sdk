// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportMsSgAuthRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportMsSgAuthRuleGroupsResponseBody body;

    public static ExportMsSgAuthRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportMsSgAuthRuleGroupsResponse self = new ExportMsSgAuthRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ExportMsSgAuthRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportMsSgAuthRuleGroupsResponse setBody(ExportMsSgAuthRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportMsSgAuthRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
