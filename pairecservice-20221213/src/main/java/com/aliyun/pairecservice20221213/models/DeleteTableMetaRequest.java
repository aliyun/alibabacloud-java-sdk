// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteTableMetaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteTableMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableMetaRequest self = new DeleteTableMetaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTableMetaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
