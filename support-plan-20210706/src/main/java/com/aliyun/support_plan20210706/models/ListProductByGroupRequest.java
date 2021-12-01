// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListProductByGroupRequest extends TeaModel {
    // 主群关联Id
    @NameInMap("OpenGroupId")
    public String openGroupId;

    public static ListProductByGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductByGroupRequest self = new ListProductByGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListProductByGroupRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

}
