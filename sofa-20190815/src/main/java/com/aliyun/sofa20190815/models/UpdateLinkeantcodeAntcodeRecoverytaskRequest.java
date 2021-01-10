// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeRecoverytaskRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RecoveryId")
    public String recoveryId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Status")
    public String status;

    public static UpdateLinkeantcodeAntcodeRecoverytaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeRecoverytaskRequest self = new UpdateLinkeantcodeAntcodeRecoverytaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeRecoverytaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeRecoverytaskRequest setRecoveryId(String recoveryId) {
        this.recoveryId = recoveryId;
        return this;
    }
    public String getRecoveryId() {
        return this.recoveryId;
    }

    public UpdateLinkeantcodeAntcodeRecoverytaskRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeRecoverytaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
