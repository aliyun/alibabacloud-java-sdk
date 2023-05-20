// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallUniBackupAgentRequest extends TeaModel {
    @NameInMap("PolicyId")
    public Long policyId;

    public static InstallUniBackupAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallUniBackupAgentRequest self = new InstallUniBackupAgentRequest();
        return TeaModel.build(map, self);
    }

    public InstallUniBackupAgentRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

}
