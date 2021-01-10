// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceSubRelationsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMsSgServiceSubRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceSubRelationsRequest self = new QueryMsSgServiceSubRelationsRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceSubRelationsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryMsSgServiceSubRelationsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
