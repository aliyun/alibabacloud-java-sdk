// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTimeZonesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryTSTimeZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTimeZonesRequest self = new QueryTSTimeZonesRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSTimeZonesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
