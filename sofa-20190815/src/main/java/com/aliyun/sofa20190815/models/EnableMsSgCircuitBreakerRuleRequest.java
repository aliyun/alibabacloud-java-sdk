// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMsSgCircuitBreakerRuleRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Status")
    public Long status;

    public static EnableMsSgCircuitBreakerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMsSgCircuitBreakerRuleRequest self = new EnableMsSgCircuitBreakerRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableMsSgCircuitBreakerRuleRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public EnableMsSgCircuitBreakerRuleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public EnableMsSgCircuitBreakerRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableMsSgCircuitBreakerRuleRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
