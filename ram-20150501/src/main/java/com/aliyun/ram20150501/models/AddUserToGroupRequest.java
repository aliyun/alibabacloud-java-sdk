// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AddUserToGroupRequest extends TeaModel {
    @NameInMap("UserName")
    public String userName;

    @NameInMap("GroupName")
    public String groupName;

    public static AddUserToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToGroupRequest self = new AddUserToGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToGroupRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public AddUserToGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
