// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDiagnosisPlantriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasDiagnosisPlantriggerResponseBody body;

    public static DeleteHasDiagnosisPlantriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDiagnosisPlantriggerResponse self = new DeleteHasDiagnosisPlantriggerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasDiagnosisPlantriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasDiagnosisPlantriggerResponse setBody(DeleteHasDiagnosisPlantriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasDiagnosisPlantriggerResponseBody getBody() {
        return this.body;
    }

}
