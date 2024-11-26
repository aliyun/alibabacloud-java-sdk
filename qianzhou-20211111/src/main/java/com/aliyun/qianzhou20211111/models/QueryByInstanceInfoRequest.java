// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class QueryByInstanceInfoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static QueryByInstanceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryByInstanceInfoRequest self = new QueryByInstanceInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryByInstanceInfoRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public QueryByInstanceInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
