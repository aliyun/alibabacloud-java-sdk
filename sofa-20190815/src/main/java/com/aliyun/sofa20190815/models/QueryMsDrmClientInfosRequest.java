// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsDrmClientInfosRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMsDrmClientInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsDrmClientInfosRequest self = new QueryMsDrmClientInfosRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsDrmClientInfosRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public QueryMsDrmClientInfosRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
