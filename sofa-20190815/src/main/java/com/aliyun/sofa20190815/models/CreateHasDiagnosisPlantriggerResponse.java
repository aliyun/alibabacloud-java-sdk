// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasDiagnosisPlantriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasDiagnosisPlantriggerResponseBody body;

    public static CreateHasDiagnosisPlantriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasDiagnosisPlantriggerResponse self = new CreateHasDiagnosisPlantriggerResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasDiagnosisPlantriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasDiagnosisPlantriggerResponse setBody(CreateHasDiagnosisPlantriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasDiagnosisPlantriggerResponseBody getBody() {
        return this.body;
    }

}
