// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPSchemasLogicTablesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LogicTableJsonStr")
    public String logicTableJsonStr;

    public static UpdateODPSchemasLogicTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPSchemasLogicTablesRequest self = new UpdateODPSchemasLogicTablesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateODPSchemasLogicTablesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateODPSchemasLogicTablesRequest setLogicTableJsonStr(String logicTableJsonStr) {
        this.logicTableJsonStr = logicTableJsonStr;
        return this;
    }
    public String getLogicTableJsonStr() {
        return this.logicTableJsonStr;
    }

}
