// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class CreateDiagnosisRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("clusterID")
    public String clusterID;

    @NameInMap("diagnosisType")
    public String diagnosisType;

    public static CreateDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosisRequest self = new CreateDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosisRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateDiagnosisRequest setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }
    public String getClusterID() {
        return this.clusterID;
    }

    public CreateDiagnosisRequest setDiagnosisType(String diagnosisType) {
        this.diagnosisType = diagnosisType;
        return this;
    }
    public String getDiagnosisType() {
        return this.diagnosisType;
    }

}
