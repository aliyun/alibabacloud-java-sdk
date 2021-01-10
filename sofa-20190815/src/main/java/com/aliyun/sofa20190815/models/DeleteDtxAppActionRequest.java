// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDtxAppActionRequest extends TeaModel {
    @NameInMap("ActionId")
    public Long actionId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDtxAppActionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDtxAppActionRequest self = new DeleteDtxAppActionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDtxAppActionRequest setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public DeleteDtxAppActionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
