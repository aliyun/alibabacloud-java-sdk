// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SimpleUser extends TeaModel {
    @NameInMap("AccountNo")
    public String accountNo;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("Role")
    public String role;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("UserName")
    public String userName;

    public static SimpleUser build(java.util.Map<String, ?> map) throws Exception {
        SimpleUser self = new SimpleUser();
        return TeaModel.build(map, self);
    }

    public SimpleUser setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public SimpleUser setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public SimpleUser setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public SimpleUser setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public SimpleUser setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
