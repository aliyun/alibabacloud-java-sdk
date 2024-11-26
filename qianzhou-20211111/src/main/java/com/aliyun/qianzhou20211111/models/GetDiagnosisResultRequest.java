// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class GetDiagnosisResultRequest extends TeaModel {
    @NameInMap("diagnosisId")
    public String diagnosisId;

    @NameInMap("ownerUid")
    public String ownerUid;

    public static GetDiagnosisResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosisResultRequest self = new GetDiagnosisResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDiagnosisResultRequest setDiagnosisId(String diagnosisId) {
        this.diagnosisId = diagnosisId;
        return this;
    }
    public String getDiagnosisId() {
        return this.diagnosisId;
    }

    public GetDiagnosisResultRequest setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

}
