// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyShardingsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ParentActivityInstanceId")
    public Long parentActivityInstanceId;

    public static QueryTSTopologyShardingsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyShardingsRequest self = new QueryTSTopologyShardingsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyShardingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSTopologyShardingsRequest setParentActivityInstanceId(Long parentActivityInstanceId) {
        this.parentActivityInstanceId = parentActivityInstanceId;
        return this;
    }
    public Long getParentActivityInstanceId() {
        return this.parentActivityInstanceId;
    }

}
