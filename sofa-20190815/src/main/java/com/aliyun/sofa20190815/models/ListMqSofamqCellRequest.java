// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqCellRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListMqSofamqCellRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqCellRequest self = new ListMqSofamqCellRequest();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqCellRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
