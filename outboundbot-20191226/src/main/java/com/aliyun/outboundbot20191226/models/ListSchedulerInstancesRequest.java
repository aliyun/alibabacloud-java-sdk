// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListSchedulerInstancesRequest extends TeaModel {
    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    public static ListSchedulerInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSchedulerInstancesRequest self = new ListSchedulerInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListSchedulerInstancesRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

}
