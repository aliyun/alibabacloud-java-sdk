// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class CreateDemandPlanV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDemandPlanV2ResponseBody body;

    public static CreateDemandPlanV2Response build(java.util.Map<String, ?> map) throws Exception {
        CreateDemandPlanV2Response self = new CreateDemandPlanV2Response();
        return TeaModel.build(map, self);
    }

    public CreateDemandPlanV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDemandPlanV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDemandPlanV2Response setBody(CreateDemandPlanV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDemandPlanV2ResponseBody getBody() {
        return this.body;
    }

}
