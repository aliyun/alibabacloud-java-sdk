// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetDiagnosisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public String result;

    @NameInMap("RunAt")
    @Validation(required = true)
    public String runAt;

    public static GetDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosisResponse self = new GetDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public GetDiagnosisResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDiagnosisResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public GetDiagnosisResponse setRunAt(String runAt) {
        this.runAt = runAt;
        return this;
    }
    public String getRunAt() {
        return this.runAt;
    }

}
