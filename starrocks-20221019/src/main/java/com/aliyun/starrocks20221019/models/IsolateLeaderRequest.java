// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class IsolateLeaderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsolateLeader")
    public Boolean isolateLeader;

    public static IsolateLeaderRequest build(java.util.Map<String, ?> map) throws Exception {
        IsolateLeaderRequest self = new IsolateLeaderRequest();
        return TeaModel.build(map, self);
    }

    public IsolateLeaderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public IsolateLeaderRequest setIsolateLeader(Boolean isolateLeader) {
        this.isolateLeader = isolateLeader;
        return this;
    }
    public Boolean getIsolateLeader() {
        return this.isolateLeader;
    }

}
