// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class GetCallerIdentityResponseBody extends TeaModel {
    @NameInMap("IdentityType")
    public String identityType;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrincipalId")
    public String principalId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("Arn")
    public String arn;

    @NameInMap("RoleId")
    public String roleId;

    public static GetCallerIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCallerIdentityResponseBody self = new GetCallerIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCallerIdentityResponseBody setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public GetCallerIdentityResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetCallerIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCallerIdentityResponseBody setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public GetCallerIdentityResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetCallerIdentityResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public GetCallerIdentityResponseBody setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
