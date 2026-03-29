// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteDataDiagnosisResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>59CE7EC6-F268-5D71-9215-32922CC50D72</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDataDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataDiagnosisResponseBody self = new DeleteDataDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
