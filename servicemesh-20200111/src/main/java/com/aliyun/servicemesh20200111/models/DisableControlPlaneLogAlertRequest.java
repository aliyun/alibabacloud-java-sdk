// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DisableControlPlaneLogAlertRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DisableControlPlaneLogAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableControlPlaneLogAlertRequest self = new DisableControlPlaneLogAlertRequest();
        return TeaModel.build(map, self);
    }

    public DisableControlPlaneLogAlertRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DisableControlPlaneLogAlertRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
