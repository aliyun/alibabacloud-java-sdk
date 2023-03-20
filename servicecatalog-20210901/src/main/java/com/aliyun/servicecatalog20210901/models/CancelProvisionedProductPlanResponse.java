// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CancelProvisionedProductPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelProvisionedProductPlanResponseBody body;

    public static CancelProvisionedProductPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelProvisionedProductPlanResponse self = new CancelProvisionedProductPlanResponse();
        return TeaModel.build(map, self);
    }

    public CancelProvisionedProductPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelProvisionedProductPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelProvisionedProductPlanResponse setBody(CancelProvisionedProductPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelProvisionedProductPlanResponseBody getBody() {
        return this.body;
    }

}
