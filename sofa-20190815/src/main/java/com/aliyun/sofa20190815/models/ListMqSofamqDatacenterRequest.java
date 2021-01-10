// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqDatacenterRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListMqSofamqDatacenterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqDatacenterRequest self = new ListMqSofamqDatacenterRequest();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqDatacenterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
