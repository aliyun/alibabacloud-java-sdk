// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteCorpGroupRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("GroupId")
    public String groupId;

    public static DeleteCorpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCorpGroupRequest self = new DeleteCorpGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCorpGroupRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public DeleteCorpGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
