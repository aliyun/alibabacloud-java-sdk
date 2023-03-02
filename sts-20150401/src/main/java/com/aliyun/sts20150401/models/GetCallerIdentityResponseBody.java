// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class GetCallerIdentityResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account to which the current requester belongs.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the current requester.</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>The type of the identity. Valid values:</p>
     * <br>
     * <p>- Account: an Alibaba Cloud account</p>
     * <p>- RamUser: a RAM user</p>
     * <p>- AssumedRoleUser: a RAM role</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The ID of the principal.</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the RAM role.</p>
     * <br>
     * <p>> This parameter is returned only when the current requester uses a RAM role.</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    /**
     * <p>The ID of the current requester.</p>
     * <br>
     * <p>- If the requester uses an Alibaba Cloud account to call the operation, the ID of the Alibaba Cloud account is returned.</p>
     * <p>- If the requester uses a RAM user to call the operation, the ID of the RAM user is returned.</p>
     * <br>
     * <p>> This parameter is returned only when the current requester uses an Alibaba Cloud account or a RAM user.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetCallerIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCallerIdentityResponseBody self = new GetCallerIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCallerIdentityResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetCallerIdentityResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public GetCallerIdentityResponseBody setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public GetCallerIdentityResponseBody setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public GetCallerIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCallerIdentityResponseBody setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public GetCallerIdentityResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
