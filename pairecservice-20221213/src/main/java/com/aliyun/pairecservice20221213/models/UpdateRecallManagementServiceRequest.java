// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateRecallManagementServiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>reso-2s416t146ffjc3yefx</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>pairec-cn-test123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateRecallManagementServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecallManagementServiceRequest self = new UpdateRecallManagementServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecallManagementServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRecallManagementServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
