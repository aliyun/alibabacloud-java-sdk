// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteBackupStrategyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteBackupStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupStrategyRequest self = new DeleteBackupStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupStrategyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
