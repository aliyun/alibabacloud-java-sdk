// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>learn-pairec-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRecallManagementConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementConfigRequest self = new GetRecallManagementConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
