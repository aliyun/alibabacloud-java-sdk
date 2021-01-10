// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDTXAppsActionRequest extends TeaModel {
    @NameInMap("ActionId")
    public Long actionId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDTXAppsActionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDTXAppsActionRequest self = new DeleteDTXAppsActionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDTXAppsActionRequest setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public DeleteDTXAppsActionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
