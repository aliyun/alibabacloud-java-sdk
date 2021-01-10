// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeTenantmembersuseridRequest extends TeaModel {
    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("UserId")
    public String userId;

    public static DeleteLinkeantcodeAntcodeTenantmembersuseridRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeTenantmembersuseridRequest self = new DeleteLinkeantcodeAntcodeTenantmembersuseridRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeTenantmembersuseridRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public DeleteLinkeantcodeAntcodeTenantmembersuseridRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
