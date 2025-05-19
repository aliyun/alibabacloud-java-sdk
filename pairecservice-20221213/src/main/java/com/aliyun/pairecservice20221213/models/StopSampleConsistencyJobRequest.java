// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StopSampleConsistencyJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static StopSampleConsistencyJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StopSampleConsistencyJobRequest self = new StopSampleConsistencyJobRequest();
        return TeaModel.build(map, self);
    }

    public StopSampleConsistencyJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
