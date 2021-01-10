// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServicePubRelationsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMsSgServicePubRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServicePubRelationsRequest self = new QueryMsSgServicePubRelationsRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServicePubRelationsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryMsSgServicePubRelationsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
