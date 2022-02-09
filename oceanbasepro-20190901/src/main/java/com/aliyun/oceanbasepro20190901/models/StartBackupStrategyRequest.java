// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StartBackupStrategyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static StartBackupStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBackupStrategyRequest self = new StartBackupStrategyRequest();
        return TeaModel.build(map, self);
    }

    public StartBackupStrategyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
