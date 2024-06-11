// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListGroupsForUserRequest extends TeaModel {
    /**
     * <p>The username of the RAM user.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static ListGroupsForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForUserRequest self = new ListGroupsForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupsForUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
