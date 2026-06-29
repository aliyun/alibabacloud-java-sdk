// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>UID of the RAM user (sub-account) under the current Alibaba Cloud account (primary account). For information about how to obtain the UID, see <a href="https://help.aliyun.com/document_detail/2330970.html">GetUser</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>166***980757310</p>
     */
    @NameInMap("AccountNo")
    public String accountNo;

    /**
     * <p>Account type. Only ALIYUN is currently supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>Role. Valid values:  </p>
     * <ul>
     * <li>OPERATOR: Annotator.  </li>
     * <li>ADMIN: Administrator.  </li>
     * <li>LEADER: Annotation team leader.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ADMIN</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>Username.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public CreateUserRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateUserRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
