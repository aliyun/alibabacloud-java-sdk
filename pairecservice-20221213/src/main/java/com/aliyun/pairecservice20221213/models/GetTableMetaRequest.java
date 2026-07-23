// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTableMetaRequest extends TeaModel {
    /**
     * <p>The ID of the instance. Call the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> API to obtain it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>实例ID	pairec-cn-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetTableMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableMetaRequest self = new GetTableMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetTableMetaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
