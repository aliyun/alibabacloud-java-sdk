// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMsSgFaultToleranceRequest extends TeaModel {
    @NameInMap("Enabled")
    public Long enabled;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableMsSgFaultToleranceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMsSgFaultToleranceRequest self = new EnableMsSgFaultToleranceRequest();
        return TeaModel.build(map, self);
    }

    public EnableMsSgFaultToleranceRequest setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public EnableMsSgFaultToleranceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public EnableMsSgFaultToleranceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
