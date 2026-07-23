// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteABMetricGroupRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can obtain this value by calling the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteABMetricGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteABMetricGroupRequest self = new DeleteABMetricGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteABMetricGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
