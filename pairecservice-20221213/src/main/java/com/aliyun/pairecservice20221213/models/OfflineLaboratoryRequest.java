// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OfflineLaboratoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static OfflineLaboratoryRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineLaboratoryRequest self = new OfflineLaboratoryRequest();
        return TeaModel.build(map, self);
    }

    public OfflineLaboratoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
