// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeMembersdeletenamespacememberRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("UserId")
    public String userId;

    public static DeleteLinkeantcodeAntcodeMembersdeletenamespacememberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeMembersdeletenamespacememberRequest self = new DeleteLinkeantcodeAntcodeMembersdeletenamespacememberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeMembersdeletenamespacememberRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeMembersdeletenamespacememberRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public DeleteLinkeantcodeAntcodeMembersdeletenamespacememberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
