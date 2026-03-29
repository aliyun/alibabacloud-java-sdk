// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteDataDiagnosisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>learn-pairec-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDataDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataDiagnosisRequest self = new DeleteDataDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataDiagnosisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
