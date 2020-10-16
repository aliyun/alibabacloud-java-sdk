// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateCorpGroupRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    public static CreateCorpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCorpGroupRequest self = new CreateCorpGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateCorpGroupRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public CreateCorpGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateCorpGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
