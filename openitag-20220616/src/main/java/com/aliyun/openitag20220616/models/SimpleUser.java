// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SimpleUser extends TeaModel {
    /**
     * <p>Account ID</p>
     * 
     * <strong>example:</strong>
     * <p>166***9980757310</p>
     */
    @NameInMap("AccountNo")
    public String accountNo;

    /**
     * <p>Account Type</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>Role</p>
     * 
     * <strong>example:</strong>
     * <p>ADMIN</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>User ID</p>
     * 
     * <strong>example:</strong>
     * <p>166***9980757311</p>
     */
    @NameInMap("UserId")
    public Long userId;

    /**
     * <p>Username</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:txdemo@test.aliyunid.com">txdemo@test.aliyunid.com</a></p>
     */
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
