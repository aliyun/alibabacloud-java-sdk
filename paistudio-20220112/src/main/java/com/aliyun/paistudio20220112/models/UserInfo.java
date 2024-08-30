// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UserInfo extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserName")
    public String userName;

    public static UserInfo build(java.util.Map<String, ?> map) throws Exception {
        UserInfo self = new UserInfo();
        return TeaModel.build(map, self);
    }

    public UserInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UserInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
