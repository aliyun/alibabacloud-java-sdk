// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsGuardianGrayRulesRequest extends TeaModel {
    @NameInMap("GuardianRule")
    public String guardianRule;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpList")
    public String ipList;

    public static AddMsGuardianGrayRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsGuardianGrayRulesRequest self = new AddMsGuardianGrayRulesRequest();
        return TeaModel.build(map, self);
    }

    public AddMsGuardianGrayRulesRequest setGuardianRule(String guardianRule) {
        this.guardianRule = guardianRule;
        return this;
    }
    public String getGuardianRule() {
        return this.guardianRule;
    }

    public AddMsGuardianGrayRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsGuardianGrayRulesRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

}
