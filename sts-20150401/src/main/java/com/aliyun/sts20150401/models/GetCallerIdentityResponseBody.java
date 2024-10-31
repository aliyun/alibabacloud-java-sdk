// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class GetCallerIdentityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>196813200012****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::196813200012****:user/admin</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <strong>example:</strong>
     * <p>RAMUser</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <strong>example:</strong>
     * <p>28877424437521****</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <strong>example:</strong>
     * <p>3C87BF47-3724-5443-ADC1-5AEAD9A03EB1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>33537620082992****</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    /**
     * <strong>example:</strong>
     * <p>216959339000****</p>
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
