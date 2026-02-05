// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-1324***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRecallManagementJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementJobRequest self = new GetRecallManagementJobRequest();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
