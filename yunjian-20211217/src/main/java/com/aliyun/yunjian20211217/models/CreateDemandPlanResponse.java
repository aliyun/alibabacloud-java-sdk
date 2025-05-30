// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class CreateDemandPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDemandPlanResponseBody body;

    public static CreateDemandPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDemandPlanResponse self = new CreateDemandPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateDemandPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDemandPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDemandPlanResponse setBody(CreateDemandPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDemandPlanResponseBody getBody() {
        return this.body;
    }

}
