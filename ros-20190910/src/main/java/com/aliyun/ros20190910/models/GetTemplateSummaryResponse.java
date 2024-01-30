// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetTemplateSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplateSummaryResponse setBody(GetTemplateSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateSummaryResponseBody getBody() {
        return this.body;
    }

}
