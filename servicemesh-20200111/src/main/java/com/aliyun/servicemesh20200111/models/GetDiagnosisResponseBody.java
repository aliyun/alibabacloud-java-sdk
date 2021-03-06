// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetDiagnosisResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunAt")
    public String runAt;

    @NameInMap("Result")
    public String result;

    public static GetDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosisResponseBody self = new GetDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDiagnosisResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDiagnosisResponseBody setRunAt(String runAt) {
        this.runAt = runAt;
        return this;
    }
    public String getRunAt() {
        return this.runAt;
    }

    public GetDiagnosisResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
