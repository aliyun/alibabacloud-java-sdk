// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSZonesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LdcType")
    public String ldcType;

    public static QueryTSZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSZonesRequest self = new QueryTSZonesRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSZonesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSZonesRequest setLdcType(String ldcType) {
        this.ldcType = ldcType;
        return this;
    }
    public String getLdcType() {
        return this.ldcType;
    }

}
