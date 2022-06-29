// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProvisionedProductPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProvisionedProductPlanResponseBody body;

    public static GetProvisionedProductPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProvisionedProductPlanResponse self = new GetProvisionedProductPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetProvisionedProductPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProvisionedProductPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProvisionedProductPlanResponse setBody(GetProvisionedProductPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProvisionedProductPlanResponseBody getBody() {
        return this.body;
    }

}
