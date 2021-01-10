// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSConfigSwitchesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryTSConfigSwitchesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSConfigSwitchesRequest self = new QueryTSConfigSwitchesRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSConfigSwitchesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
