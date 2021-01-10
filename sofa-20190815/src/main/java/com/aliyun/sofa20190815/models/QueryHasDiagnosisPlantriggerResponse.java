// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisPlantriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisPlantriggerResponseBody body;

    public static QueryHasDiagnosisPlantriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisPlantriggerResponse self = new QueryHasDiagnosisPlantriggerResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisPlantriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisPlantriggerResponse setBody(QueryHasDiagnosisPlantriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisPlantriggerResponseBody getBody() {
        return this.body;
    }

}
