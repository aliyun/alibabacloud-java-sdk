// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class GetEnterpriseDingtalkGroupRequest extends TeaModel {
    @NameInMap("OpenGroupId")
    public String openGroupId;

    public static GetEnterpriseDingtalkGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDingtalkGroupRequest self = new GetEnterpriseDingtalkGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDingtalkGroupRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

}
