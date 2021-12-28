// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class EnableControlPlaneLogAlertRequest extends TeaModel {
    @NameInMap("ActionPolicyId")
    public String actionPolicyId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static EnableControlPlaneLogAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableControlPlaneLogAlertRequest self = new EnableControlPlaneLogAlertRequest();
        return TeaModel.build(map, self);
    }

    public EnableControlPlaneLogAlertRequest setActionPolicyId(String actionPolicyId) {
        this.actionPolicyId = actionPolicyId;
        return this;
    }
    public String getActionPolicyId() {
        return this.actionPolicyId;
    }

    public EnableControlPlaneLogAlertRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public EnableControlPlaneLogAlertRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
