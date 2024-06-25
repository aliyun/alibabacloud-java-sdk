// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetSceneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSceneRequest self = new GetSceneRequest();
        return TeaModel.build(map, self);
    }

    public GetSceneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
