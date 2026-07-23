// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OnlineExperimentRequest extends TeaModel {
    /**
     * <p>The ID of the instance, which you can obtain by calling the ListInstances API.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static OnlineExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineExperimentRequest self = new OnlineExperimentRequest();
        return TeaModel.build(map, self);
    }

    public OnlineExperimentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
