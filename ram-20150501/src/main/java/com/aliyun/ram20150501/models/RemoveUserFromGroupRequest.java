// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class RemoveUserFromGroupRequest extends TeaModel {
    /**
     * <p>The name of the RAM user group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The name of the RAM user.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static RemoveUserFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromGroupRequest self = new RemoveUserFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public RemoveUserFromGroupRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
