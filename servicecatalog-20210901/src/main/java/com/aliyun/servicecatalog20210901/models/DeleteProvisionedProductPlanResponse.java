// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeleteProvisionedProductPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProvisionedProductPlanResponseBody body;

    public static DeleteProvisionedProductPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProvisionedProductPlanResponse self = new DeleteProvisionedProductPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProvisionedProductPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProvisionedProductPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProvisionedProductPlanResponse setBody(DeleteProvisionedProductPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProvisionedProductPlanResponseBody getBody() {
        return this.body;
    }

}
