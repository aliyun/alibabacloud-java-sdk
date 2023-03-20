// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ApproveProvisionedProductPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApproveProvisionedProductPlanResponseBody body;

    public static ApproveProvisionedProductPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveProvisionedProductPlanResponse self = new ApproveProvisionedProductPlanResponse();
        return TeaModel.build(map, self);
    }

    public ApproveProvisionedProductPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveProvisionedProductPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApproveProvisionedProductPlanResponse setBody(ApproveProvisionedProductPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveProvisionedProductPlanResponseBody getBody() {
        return this.body;
    }

}
