// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteTableMetaRequest extends TeaModel {
    /**
     * <p>The ID of the instance. To obtain this ID, call the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>实例ID	pairec-cn-test1</p>
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
