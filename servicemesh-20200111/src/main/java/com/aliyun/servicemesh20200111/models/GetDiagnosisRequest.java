// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetDiagnosisRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    public static GetDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosisRequest self = new GetDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public GetDiagnosisRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
