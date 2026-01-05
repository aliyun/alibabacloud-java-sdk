// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ExecuteProvisionedProductPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteProvisionedProductPlanResponseBody body;

    public static ExecuteProvisionedProductPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteProvisionedProductPlanResponse self = new ExecuteProvisionedProductPlanResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteProvisionedProductPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteProvisionedProductPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteProvisionedProductPlanResponse setBody(ExecuteProvisionedProductPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteProvisionedProductPlanResponseBody getBody() {
        return this.body;
    }

}
