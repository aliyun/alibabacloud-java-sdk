// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageAnalysisRuleProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListImageAnalysisRuleProjectResponseBody body;

    public static ListImageAnalysisRuleProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageAnalysisRuleProjectResponse self = new ListImageAnalysisRuleProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListImageAnalysisRuleProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageAnalysisRuleProjectResponse setBody(ListImageAnalysisRuleProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageAnalysisRuleProjectResponseBody getBody() {
        return this.body;
    }

}
