// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOperatorPermissionRequest extends TeaModel {
    // Oceanbase集群ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteOperatorPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOperatorPermissionRequest self = new DeleteOperatorPermissionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOperatorPermissionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
