// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ReduceApplicationCapacityByInstanceIdsRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the instance. Separate multiple instances with commas (,).</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    public static ReduceApplicationCapacityByInstanceIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ReduceApplicationCapacityByInstanceIdsRequest self = new ReduceApplicationCapacityByInstanceIdsRequest();
        return TeaModel.build(map, self);
    }

    public ReduceApplicationCapacityByInstanceIdsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ReduceApplicationCapacityByInstanceIdsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
