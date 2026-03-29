// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateDataDiagnosisJobsResponseBody extends TeaModel {
    @NameInMap("DataDiagnosisJobIds")
    public java.util.List<String> dataDiagnosisJobIds;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataDiagnosisJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataDiagnosisJobsResponseBody self = new CreateDataDiagnosisJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataDiagnosisJobsResponseBody setDataDiagnosisJobIds(java.util.List<String> dataDiagnosisJobIds) {
        this.dataDiagnosisJobIds = dataDiagnosisJobIds;
        return this;
    }
    public java.util.List<String> getDataDiagnosisJobIds() {
        return this.dataDiagnosisJobIds;
    }

    public CreateDataDiagnosisJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
