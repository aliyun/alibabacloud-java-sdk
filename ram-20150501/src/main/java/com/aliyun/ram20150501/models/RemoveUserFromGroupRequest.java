// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class RemoveUserFromGroupRequest extends TeaModel {
    @NameInMap("UserName")
    public String userName;

    @NameInMap("GroupName")
    public String groupName;

    public static RemoveUserFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromGroupRequest self = new RemoveUserFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromGroupRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public RemoveUserFromGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
