// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateDataDiagnosisResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataDiagnosisId")
    public String dataDiagnosisId;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataDiagnosisResponseBody self = new CreateDataDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataDiagnosisResponseBody setDataDiagnosisId(String dataDiagnosisId) {
        this.dataDiagnosisId = dataDiagnosisId;
        return this;
    }
    public String getDataDiagnosisId() {
        return this.dataDiagnosisId;
    }

    public CreateDataDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
