// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTTraceHistoriesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListDSTTraceHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDSTTraceHistoriesRequest self = new ListDSTTraceHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListDSTTraceHistoriesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
