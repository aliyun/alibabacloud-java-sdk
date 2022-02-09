// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopBackupStrategyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static StopBackupStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        StopBackupStrategyRequest self = new StopBackupStrategyRequest();
        return TeaModel.build(map, self);
    }

    public StopBackupStrategyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
