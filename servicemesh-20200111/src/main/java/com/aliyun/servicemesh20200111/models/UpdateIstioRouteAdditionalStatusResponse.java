// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioRouteAdditionalStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIstioRouteAdditionalStatusResponseBody body;

    public static UpdateIstioRouteAdditionalStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIstioRouteAdditionalStatusResponse self = new UpdateIstioRouteAdditionalStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIstioRouteAdditionalStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIstioRouteAdditionalStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIstioRouteAdditionalStatusResponse setBody(UpdateIstioRouteAdditionalStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIstioRouteAdditionalStatusResponseBody getBody() {
        return this.body;
    }

}
