// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDTXAppsRecoveryRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RecoveryId")
    public Long recoveryId;

    public static DeleteDTXAppsRecoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDTXAppsRecoveryRequest self = new DeleteDTXAppsRecoveryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDTXAppsRecoveryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDTXAppsRecoveryRequest setRecoveryId(Long recoveryId) {
        this.recoveryId = recoveryId;
        return this;
    }
    public Long getRecoveryId() {
        return this.recoveryId;
    }

}
