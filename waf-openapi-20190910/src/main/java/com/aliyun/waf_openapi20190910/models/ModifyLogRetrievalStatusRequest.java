// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyLogRetrievalStatusRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Enabled")
    public Integer enabled;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyLogRetrievalStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogRetrievalStatusRequest self = new ModifyLogRetrievalStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogRetrievalStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyLogRetrievalStatusRequest setEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }
    public Integer getEnabled() {
        return this.enabled;
    }

    public ModifyLogRetrievalStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
