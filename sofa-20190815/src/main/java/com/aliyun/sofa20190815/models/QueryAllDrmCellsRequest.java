// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAllDrmCellsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryAllDrmCellsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAllDrmCellsRequest self = new QueryAllDrmCellsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAllDrmCellsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
