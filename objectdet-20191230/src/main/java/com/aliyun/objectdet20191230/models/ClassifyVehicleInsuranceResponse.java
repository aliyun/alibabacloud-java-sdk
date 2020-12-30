// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class ClassifyVehicleInsuranceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ClassifyVehicleInsuranceResponseBody body;

    public static ClassifyVehicleInsuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        ClassifyVehicleInsuranceResponse self = new ClassifyVehicleInsuranceResponse();
        return TeaModel.build(map, self);
    }

    public ClassifyVehicleInsuranceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClassifyVehicleInsuranceResponse setBody(ClassifyVehicleInsuranceResponseBody body) {
        this.body = body;
        return this;
    }
    public ClassifyVehicleInsuranceResponseBody getBody() {
        return this.body;
    }

}
