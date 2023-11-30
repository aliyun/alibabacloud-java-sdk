// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetGroupRequest extends TeaModel {
    /**
     * <p>The group ID.</p>
     */
    @NameInMap("group_id")
    public String groupId;

    public static GetGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupRequest self = new GetGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
