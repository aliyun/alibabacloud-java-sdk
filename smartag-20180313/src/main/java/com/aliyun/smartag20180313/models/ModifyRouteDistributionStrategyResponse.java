// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyRouteDistributionStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRouteDistributionStrategyResponseBody body;

    public static ModifyRouteDistributionStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteDistributionStrategyResponse self = new ModifyRouteDistributionStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRouteDistributionStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRouteDistributionStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRouteDistributionStrategyResponse setBody(ModifyRouteDistributionStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRouteDistributionStrategyResponseBody getBody() {
        return this.body;
    }

}
