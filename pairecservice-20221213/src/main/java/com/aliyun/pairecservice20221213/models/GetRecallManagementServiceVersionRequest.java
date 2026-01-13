// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementServiceVersionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>learn-pairec-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRecallManagementServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementServiceVersionRequest self = new GetRecallManagementServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementServiceVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
