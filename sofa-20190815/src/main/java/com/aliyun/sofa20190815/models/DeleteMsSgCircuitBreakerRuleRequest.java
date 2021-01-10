// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsSgCircuitBreakerRuleRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteMsSgCircuitBreakerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsSgCircuitBreakerRuleRequest self = new DeleteMsSgCircuitBreakerRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsSgCircuitBreakerRuleRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DeleteMsSgCircuitBreakerRuleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteMsSgCircuitBreakerRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
