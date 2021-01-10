// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetMsSgCircuitBreakerRuleRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mode")
    public String mode;

    public static SetMsSgCircuitBreakerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMsSgCircuitBreakerRuleRequest self = new SetMsSgCircuitBreakerRuleRequest();
        return TeaModel.build(map, self);
    }

    public SetMsSgCircuitBreakerRuleRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SetMsSgCircuitBreakerRuleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetMsSgCircuitBreakerRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetMsSgCircuitBreakerRuleRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
