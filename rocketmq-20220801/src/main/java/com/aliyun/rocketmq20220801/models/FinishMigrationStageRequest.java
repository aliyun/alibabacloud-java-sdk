// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class FinishMigrationStageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rmq-cn-pe334f1nx04</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    public static FinishMigrationStageRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishMigrationStageRequest self = new FinishMigrationStageRequest();
        return TeaModel.build(map, self);
    }

    public FinishMigrationStageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
