// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProvisionedProductPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProvisionedProductPlanResponseBody body;

    public static CreateProvisionedProductPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProvisionedProductPlanResponse self = new CreateProvisionedProductPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateProvisionedProductPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProvisionedProductPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProvisionedProductPlanResponse setBody(CreateProvisionedProductPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProvisionedProductPlanResponseBody getBody() {
        return this.body;
    }

}
