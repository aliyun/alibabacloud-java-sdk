// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteParamRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteParamRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteParamRequest self = new DeleteParamRequest();
        return TeaModel.build(map, self);
    }

    public DeleteParamRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
