// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest extends TeaModel {
    @NameInMap("RecoveryId")
    public String recoveryId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Status")
    public String status;

    public static UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest self = new UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest setRecoveryId(String recoveryId) {
        this.recoveryId = recoveryId;
        return this;
    }
    public String getRecoveryId() {
        return this.recoveryId;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
