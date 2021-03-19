// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot_inner20191226.models;

import com.aliyun.tea.*;

public class RemoveNumberSupplierRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SupplierId")
    public String supplierId;

    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    public static RemoveNumberSupplierRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveNumberSupplierRequest self = new RemoveNumberSupplierRequest();
        return TeaModel.build(map, self);
    }

    public RemoveNumberSupplierRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveNumberSupplierRequest setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

    public RemoveNumberSupplierRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

}
