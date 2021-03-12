// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RunDiagnosisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static RunDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunDiagnosisResponseBody self = new RunDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public RunDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunDiagnosisResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
