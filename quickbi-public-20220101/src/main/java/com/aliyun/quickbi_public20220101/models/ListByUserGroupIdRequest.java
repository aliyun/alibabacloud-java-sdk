// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListByUserGroupIdRequest extends TeaModel {
    @NameInMap("UserGroupIds")
    public String userGroupIds;

    public static ListByUserGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListByUserGroupIdRequest self = new ListByUserGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public ListByUserGroupIdRequest setUserGroupIds(String userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public String getUserGroupIds() {
        return this.userGroupIds;
    }

}
