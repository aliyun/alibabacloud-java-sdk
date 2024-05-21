// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListUserGroupsByUserIdRequest extends TeaModel {
    /**
     * <p>The ID of the user group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListUserGroupsByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsByUserIdRequest self = new ListUserGroupsByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsByUserIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
