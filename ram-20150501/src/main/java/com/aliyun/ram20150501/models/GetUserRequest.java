// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetUserRequest extends TeaModel {
    /**
     * <p>The username of the RAM user.</p>
     * <br>
     * <p>The username must be 1 to 64 characters in length, and can contain letters, digits, periods (.), hyphens (-), and underscores (_).</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static GetUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserRequest self = new GetUserRequest();
        return TeaModel.build(map, self);
    }

    public GetUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
