// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsGuardianGrayRuleStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpList")
    public String ipList;

    @NameInMap("RuleId")
    public Long ruleId;

    public static UpdateMsGuardianGrayRuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsGuardianGrayRuleStatusRequest self = new UpdateMsGuardianGrayRuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsGuardianGrayRuleStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMsGuardianGrayRuleStatusRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public UpdateMsGuardianGrayRuleStatusRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
