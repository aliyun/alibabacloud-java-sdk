// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSZoneListRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryTSZoneListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSZoneListRequest self = new QueryTSZoneListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSZoneListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
