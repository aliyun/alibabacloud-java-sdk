// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyLogServiceStatusRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Enabled")
    public Integer enabled;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyLogServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogServiceStatusRequest self = new ModifyLogServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogServiceStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyLogServiceStatusRequest setEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }
    public Integer getEnabled() {
        return this.enabled;
    }

    public ModifyLogServiceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
