// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QuerySofamqCellByCellTypeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QuerySofamqCellByCellTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqCellByCellTypeRequest self = new QuerySofamqCellByCellTypeRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqCellByCellTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
