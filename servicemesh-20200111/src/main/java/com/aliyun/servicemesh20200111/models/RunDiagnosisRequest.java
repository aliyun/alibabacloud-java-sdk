// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RunDiagnosisRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static RunDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDiagnosisRequest self = new RunDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public RunDiagnosisRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
