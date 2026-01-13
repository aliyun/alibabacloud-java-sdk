// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ChangeRecallManagementServiceVersionRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RecallManagementServiceVersionId")
    public String recallManagementServiceVersionId;

    public static ChangeRecallManagementServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeRecallManagementServiceVersionRequest self = new ChangeRecallManagementServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public ChangeRecallManagementServiceVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeRecallManagementServiceVersionRequest setRecallManagementServiceVersionId(String recallManagementServiceVersionId) {
        this.recallManagementServiceVersionId = recallManagementServiceVersionId;
        return this;
    }
    public String getRecallManagementServiceVersionId() {
        return this.recallManagementServiceVersionId;
    }

}
