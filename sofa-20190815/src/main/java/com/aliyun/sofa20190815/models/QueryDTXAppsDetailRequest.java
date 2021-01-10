// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDTXAppsDetailRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryDTXAppsDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDTXAppsDetailRequest self = new QueryDTXAppsDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryDTXAppsDetailRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public QueryDTXAppsDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
