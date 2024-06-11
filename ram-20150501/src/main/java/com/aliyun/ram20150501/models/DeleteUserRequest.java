// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeleteUserRequest extends TeaModel {
    /**
     * <p>The name of the RAM user.</p>
     * <br>
     * <p>The name must be 1 to 64 characters in length, and can contain letters, digits, periods (.), hyphens (-), and underscores (_).</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static DeleteUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserRequest self = new DeleteUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
