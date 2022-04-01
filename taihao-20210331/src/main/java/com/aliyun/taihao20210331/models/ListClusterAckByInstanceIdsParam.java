// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterAckByInstanceIdsParam extends TeaModel {
    // instanceIds
    @NameInMap("instanceIds")
    public java.util.List<String> instanceIds;

    public static ListClusterAckByInstanceIdsParam build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAckByInstanceIdsParam self = new ListClusterAckByInstanceIdsParam();
        return TeaModel.build(map, self);
    }

    public ListClusterAckByInstanceIdsParam setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
