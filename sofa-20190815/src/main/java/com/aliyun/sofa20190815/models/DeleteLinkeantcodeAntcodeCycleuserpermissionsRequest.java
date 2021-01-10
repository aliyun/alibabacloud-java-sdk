// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeCycleuserpermissionsRequest extends TeaModel {
    @NameInMap("ExternalUserId")
    public String externalUserId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Token")
    public String token;

    public static DeleteLinkeantcodeAntcodeCycleuserpermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeCycleuserpermissionsRequest self = new DeleteLinkeantcodeAntcodeCycleuserpermissionsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeCycleuserpermissionsRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public DeleteLinkeantcodeAntcodeCycleuserpermissionsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public DeleteLinkeantcodeAntcodeCycleuserpermissionsRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
