// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDmsBindingRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDmsBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDmsBindingRequest self = new DeleteDmsBindingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDmsBindingRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteDmsBindingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
