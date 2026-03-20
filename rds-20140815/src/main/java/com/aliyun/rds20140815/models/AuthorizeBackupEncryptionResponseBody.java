// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AuthorizeBackupEncryptionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthorizationState")
    public Integer authorizationState;

    /**
     * <strong>example:</strong>
     * <p>create backup encrypt service linked role error.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1A1DD2A4-69F7-5848-AD56-********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::113991************:role/AliyunServiceRoleForRdsBackupEncryption</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    public static AuthorizeBackupEncryptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeBackupEncryptionResponseBody self = new AuthorizeBackupEncryptionResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeBackupEncryptionResponseBody setAuthorizationState(Integer authorizationState) {
        this.authorizationState = authorizationState;
        return this;
    }
    public Integer getAuthorizationState() {
        return this.authorizationState;
    }

    public AuthorizeBackupEncryptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthorizeBackupEncryptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthorizeBackupEncryptionResponseBody setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

}
