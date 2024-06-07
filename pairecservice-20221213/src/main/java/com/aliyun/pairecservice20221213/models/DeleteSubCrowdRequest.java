// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteSubCrowdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteSubCrowdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubCrowdRequest self = new DeleteSubCrowdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSubCrowdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
