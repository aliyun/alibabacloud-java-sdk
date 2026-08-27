// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateUserWithGroupsResponseBody extends TeaModel {
    /**
     * <p>The WINNEXO logon account.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleAccountId</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <p>The business status code. A value of 200 indicates success. A failure returns a backend error code (ERR.* or InvalidParameter.*).</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The display name of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Indicates whether the user is newly created. A value of false indicates that an existing user joined the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isNewUser")
    public Boolean isNewUser;

    /**
     * <p>The error description. This parameter is empty when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The WINNEXO platform user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("wnUserId")
    public String wnUserId;

    public static CreateUserWithGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserWithGroupsResponseBody self = new CreateUserWithGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserWithGroupsResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateUserWithGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateUserWithGroupsResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUserWithGroupsResponseBody setIsNewUser(Boolean isNewUser) {
        this.isNewUser = isNewUser;
        return this;
    }
    public Boolean getIsNewUser() {
        return this.isNewUser;
    }

    public CreateUserWithGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateUserWithGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserWithGroupsResponseBody setWnUserId(String wnUserId) {
        this.wnUserId = wnUserId;
        return this;
    }
    public String getWnUserId() {
        return this.wnUserId;
    }

}
