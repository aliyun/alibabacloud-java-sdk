// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallUniBackupAgentRequest extends TeaModel {
    @NameInMap("PolicyId")
    public Long policyId;

    public static UninstallUniBackupAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallUniBackupAgentRequest self = new UninstallUniBackupAgentRequest();
        return TeaModel.build(map, self);
    }

    public UninstallUniBackupAgentRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

}
