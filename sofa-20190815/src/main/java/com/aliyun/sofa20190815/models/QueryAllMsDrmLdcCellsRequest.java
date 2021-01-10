// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAllMsDrmLdcCellsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryAllMsDrmLdcCellsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAllMsDrmLdcCellsRequest self = new QueryAllMsDrmLdcCellsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAllMsDrmLdcCellsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
