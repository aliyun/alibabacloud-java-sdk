// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeTenantmembersuseridRequest extends TeaModel {
    @NameInMap("AccessLevel")
    public String accessLevel;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("UserId")
    public String userId;

    public static UpdateLinkeantcodeAntcodeTenantmembersuseridRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeTenantmembersuseridRequest self = new UpdateLinkeantcodeAntcodeTenantmembersuseridRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridRequest setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public String getAccessLevel() {
        return this.accessLevel;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
