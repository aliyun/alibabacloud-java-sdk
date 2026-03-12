// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class RollbackConfigModificationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>187291</p>
     */
    @NameInMap("ConfigHistoryId")
    public Long configHistoryId;

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
    @NameInMap("Restart")
    public Boolean restart;

    public static RollbackConfigModificationRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackConfigModificationRequest self = new RollbackConfigModificationRequest();
        return TeaModel.build(map, self);
    }

    public RollbackConfigModificationRequest setConfigHistoryId(Long configHistoryId) {
        this.configHistoryId = configHistoryId;
        return this;
    }
    public Long getConfigHistoryId() {
        return this.configHistoryId;
    }

    public RollbackConfigModificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RollbackConfigModificationRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

}
