// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetDataDiagnosisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>learn-pairec-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDataDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataDiagnosisRequest self = new GetDataDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public GetDataDiagnosisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
