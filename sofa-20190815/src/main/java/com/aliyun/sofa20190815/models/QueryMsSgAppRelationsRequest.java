// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgAppRelationsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMsSgAppRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgAppRelationsRequest self = new QueryMsSgAppRelationsRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsSgAppRelationsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryMsSgAppRelationsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
