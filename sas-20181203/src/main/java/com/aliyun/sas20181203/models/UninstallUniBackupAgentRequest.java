// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallUniBackupAgentRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PolicyId")
    public Long policyId;

    public static UninstallUniBackupAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallUniBackupAgentRequest self = new UninstallUniBackupAgentRequest();
        return TeaModel.build(map, self);
    }

    public UninstallUniBackupAgentRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UninstallUniBackupAgentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UninstallUniBackupAgentRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

}
