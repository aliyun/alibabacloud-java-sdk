// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetStrategyTemplateDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStrategyTemplateDetailResponseBody body;

    public static GetStrategyTemplateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStrategyTemplateDetailResponse self = new GetStrategyTemplateDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetStrategyTemplateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStrategyTemplateDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStrategyTemplateDetailResponse setBody(GetStrategyTemplateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStrategyTemplateDetailResponseBody getBody() {
        return this.body;
    }

}
