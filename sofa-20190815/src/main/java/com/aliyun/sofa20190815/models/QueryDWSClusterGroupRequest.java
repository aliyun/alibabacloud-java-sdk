// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDWSClusterGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryDWSClusterGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDWSClusterGroupRequest self = new QueryDWSClusterGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryDWSClusterGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
