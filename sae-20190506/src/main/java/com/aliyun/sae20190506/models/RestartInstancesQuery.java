// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartInstancesQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("InstanceIds")
    @Validation(required = true)
    public String instanceIds;

    public static RestartInstancesQuery build(java.util.Map<String, ?> map) throws Exception {
        RestartInstancesQuery self = new RestartInstancesQuery();
        return TeaModel.build(map, self);
    }

    public RestartInstancesQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RestartInstancesQuery setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
