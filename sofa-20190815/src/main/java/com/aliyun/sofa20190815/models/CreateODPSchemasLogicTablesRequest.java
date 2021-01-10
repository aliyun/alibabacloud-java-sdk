// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateODPSchemasLogicTablesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LogicTableJsonStr")
    public String logicTableJsonStr;

    public static CreateODPSchemasLogicTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateODPSchemasLogicTablesRequest self = new CreateODPSchemasLogicTablesRequest();
        return TeaModel.build(map, self);
    }

    public CreateODPSchemasLogicTablesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateODPSchemasLogicTablesRequest setLogicTableJsonStr(String logicTableJsonStr) {
        this.logicTableJsonStr = logicTableJsonStr;
        return this;
    }
    public String getLogicTableJsonStr() {
        return this.logicTableJsonStr;
    }

}
