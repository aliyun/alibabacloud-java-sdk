// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class QueryNodeInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("regionId")
    public String regionId;

    public static QueryNodeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNodeInfoRequest self = new QueryNodeInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryNodeInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryNodeInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
