// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTemplateSummaryResponseBody body;

    public static GetTemplateSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateSummaryResponse self = new GetTemplateSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateSummaryResponse setBody(GetTemplateSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateSummaryResponseBody getBody() {
        return this.body;
    }

}
