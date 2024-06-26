// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class WithdrawAllUserGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the user. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>46e5374665ba4b679ee22e2a2927****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static WithdrawAllUserGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawAllUserGroupsRequest self = new WithdrawAllUserGroupsRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawAllUserGroupsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
