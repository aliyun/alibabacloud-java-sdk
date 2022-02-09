// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class PreCheckCreateDataBackupTaskRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static PreCheckCreateDataBackupTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PreCheckCreateDataBackupTaskRequest self = new PreCheckCreateDataBackupTaskRequest();
        return TeaModel.build(map, self);
    }

    public PreCheckCreateDataBackupTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
