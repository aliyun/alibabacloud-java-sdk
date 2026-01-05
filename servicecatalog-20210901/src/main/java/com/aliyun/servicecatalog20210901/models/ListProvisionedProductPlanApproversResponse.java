// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductPlanApproversResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProvisionedProductPlanApproversResponseBody body;

    public static ListProvisionedProductPlanApproversResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionedProductPlanApproversResponse self = new ListProvisionedProductPlanApproversResponse();
        return TeaModel.build(map, self);
    }

    public ListProvisionedProductPlanApproversResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProvisionedProductPlanApproversResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProvisionedProductPlanApproversResponse setBody(ListProvisionedProductPlanApproversResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProvisionedProductPlanApproversResponseBody getBody() {
        return this.body;
    }

}
