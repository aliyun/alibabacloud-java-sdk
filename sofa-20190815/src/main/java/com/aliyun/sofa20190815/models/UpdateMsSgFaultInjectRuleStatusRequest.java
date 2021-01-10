// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgFaultInjectRuleStatusRequest extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateMsSgFaultInjectRuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgFaultInjectRuleStatusRequest self = new UpdateMsSgFaultInjectRuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgFaultInjectRuleStatusRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateMsSgFaultInjectRuleStatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMsSgFaultInjectRuleStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
