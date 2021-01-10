// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetTaskRuleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskRuleListResponseBody body;

    public static GetTaskRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskRuleListResponse self = new GetTaskRuleListResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskRuleListResponse setBody(GetTaskRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskRuleListResponseBody getBody() {
        return this.body;
    }

}
