// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ListOperationActivityRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>op-f49743caa809****</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    public static ListOperationActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationActivityRequest self = new ListOperationActivityRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationActivityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOperationActivityRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
