// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDtxAppDetailRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryDtxAppDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDtxAppDetailRequest self = new QueryDtxAppDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryDtxAppDetailRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public QueryDtxAppDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
