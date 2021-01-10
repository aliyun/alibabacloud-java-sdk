// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSZoneModeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryTSZoneModeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSZoneModeRequest self = new QueryTSZoneModeRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSZoneModeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
