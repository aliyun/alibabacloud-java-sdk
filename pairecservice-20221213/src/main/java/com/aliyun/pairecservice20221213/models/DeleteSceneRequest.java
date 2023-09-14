// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteSceneRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneRequest self = new DeleteSceneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSceneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
