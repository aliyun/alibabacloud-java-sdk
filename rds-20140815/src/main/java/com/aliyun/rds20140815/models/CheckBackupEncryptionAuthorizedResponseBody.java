// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckBackupEncryptionAuthorizedResponseBody extends TeaModel {
    @NameInMap("AuthorizationState")
    public String authorizationState;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoleARN")
    public String roleARN;

    public static CheckBackupEncryptionAuthorizedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckBackupEncryptionAuthorizedResponseBody self = new CheckBackupEncryptionAuthorizedResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckBackupEncryptionAuthorizedResponseBody setAuthorizationState(String authorizationState) {
        this.authorizationState = authorizationState;
        return this;
    }
    public String getAuthorizationState() {
        return this.authorizationState;
    }

    public CheckBackupEncryptionAuthorizedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckBackupEncryptionAuthorizedResponseBody setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

}
