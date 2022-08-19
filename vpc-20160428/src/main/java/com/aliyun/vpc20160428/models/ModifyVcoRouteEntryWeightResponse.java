// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVcoRouteEntryWeightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyVcoRouteEntryWeightResponseBody body;

    public static ModifyVcoRouteEntryWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVcoRouteEntryWeightResponse self = new ModifyVcoRouteEntryWeightResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVcoRouteEntryWeightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVcoRouteEntryWeightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVcoRouteEntryWeightResponse setBody(ModifyVcoRouteEntryWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVcoRouteEntryWeightResponseBody getBody() {
        return this.body;
    }

}
