// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAllDrmAppsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryAllDrmAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAllDrmAppsRequest self = new QueryAllDrmAppsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAllDrmAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
