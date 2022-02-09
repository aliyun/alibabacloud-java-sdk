// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateInstantBackupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateInstantBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstantBackupRequest self = new CreateInstantBackupRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstantBackupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
