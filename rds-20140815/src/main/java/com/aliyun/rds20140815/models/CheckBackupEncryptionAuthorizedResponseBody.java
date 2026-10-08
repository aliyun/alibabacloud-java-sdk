// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckBackupEncryptionAuthorizedResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the account is authorized. Valid values:</p>
     * <ul>
     * <li>0: Not authorized.</li>
     * <li>1: Authorized.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthorizationState")
    public String authorizationState;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB07C463-7428-50AA-9E39-********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Alibaba Resource Name (ARN) of the service-linked role associated with Cloud Hardware Security Module (CloudHSM) for backup encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1139916************:role/AliyunServiceRoleForRdsBackupEncryption</p>
     */
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
