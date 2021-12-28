// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateControlPlaneLogAlertActionPolicyRequest extends TeaModel {
    @NameInMap("ActionPolicyId")
    public String actionPolicyId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static UpdateControlPlaneLogAlertActionPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPlaneLogAlertActionPolicyRequest self = new UpdateControlPlaneLogAlertActionPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateControlPlaneLogAlertActionPolicyRequest setActionPolicyId(String actionPolicyId) {
        this.actionPolicyId = actionPolicyId;
        return this;
    }
    public String getActionPolicyId() {
        return this.actionPolicyId;
    }

    public UpdateControlPlaneLogAlertActionPolicyRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateControlPlaneLogAlertActionPolicyRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
