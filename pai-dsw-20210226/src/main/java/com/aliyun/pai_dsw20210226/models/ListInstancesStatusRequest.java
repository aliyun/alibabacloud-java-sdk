// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstancesStatusRequest extends TeaModel {
    // 实例Id列表
    @NameInMap("InstanceIds")
    public String instanceIds;

    public static ListInstancesStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesStatusRequest self = new ListInstancesStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesStatusRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
