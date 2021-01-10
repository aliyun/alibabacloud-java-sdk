// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgRouterRuleGroupStatusRequest extends TeaModel {
    @NameInMap("DispatchVersion")
    public Long dispatchVersion;

    @NameInMap("Enabled")
    public Long enabled;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateMsSgRouterRuleGroupStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgRouterRuleGroupStatusRequest self = new UpdateMsSgRouterRuleGroupStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgRouterRuleGroupStatusRequest setDispatchVersion(Long dispatchVersion) {
        this.dispatchVersion = dispatchVersion;
        return this;
    }
    public Long getDispatchVersion() {
        return this.dispatchVersion;
    }

    public UpdateMsSgRouterRuleGroupStatusRequest setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public UpdateMsSgRouterRuleGroupStatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMsSgRouterRuleGroupStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
