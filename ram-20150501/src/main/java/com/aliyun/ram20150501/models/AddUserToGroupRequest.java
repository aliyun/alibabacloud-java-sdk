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

}
