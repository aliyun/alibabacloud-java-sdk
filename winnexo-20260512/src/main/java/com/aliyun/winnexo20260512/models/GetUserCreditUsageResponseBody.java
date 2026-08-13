// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetUserCreditUsageResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>用户 credit 限额</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("creditLimit")
    public String creditLimit;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>剩余 credit（实时，来自 Redis）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("remainingCredits")
    public String remainingCredits;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>影子 credit 限额</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("shadowCreditLimit")
    public String shadowCreditLimit;

    /**
     * <p>剩余影子 credit（实时，来自 Redis）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("shadowRemainingCredits")
    public String shadowRemainingCredits;

    /**
     * <p>已消耗影子 credit（实时，来自 Redis）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("shadowUsedCredits")
    public String shadowUsedCredits;

    /**
     * <p>租户ID</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public Long tenantId;

    /**
     * <p>已消耗 credit（实时，来自 Redis）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("usedCredits")
    public String usedCredits;

    /**
     * <p>用户ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("userId")
    public Long userId;

    public static GetUserCreditUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserCreditUsageResponseBody self = new GetUserCreditUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserCreditUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserCreditUsageResponseBody setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
        return this;
    }
    public String getCreditLimit() {
        return this.creditLimit;
    }

    public GetUserCreditUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserCreditUsageResponseBody setRemainingCredits(String remainingCredits) {
        this.remainingCredits = remainingCredits;
        return this;
    }
    public String getRemainingCredits() {
        return this.remainingCredits;
    }

    public GetUserCreditUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserCreditUsageResponseBody setShadowCreditLimit(String shadowCreditLimit) {
        this.shadowCreditLimit = shadowCreditLimit;
        return this;
    }
    public String getShadowCreditLimit() {
        return this.shadowCreditLimit;
    }

    public GetUserCreditUsageResponseBody setShadowRemainingCredits(String shadowRemainingCredits) {
        this.shadowRemainingCredits = shadowRemainingCredits;
        return this;
    }
    public String getShadowRemainingCredits() {
        return this.shadowRemainingCredits;
    }

    public GetUserCreditUsageResponseBody setShadowUsedCredits(String shadowUsedCredits) {
        this.shadowUsedCredits = shadowUsedCredits;
        return this;
    }
    public String getShadowUsedCredits() {
        return this.shadowUsedCredits;
    }

    public GetUserCreditUsageResponseBody setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public GetUserCreditUsageResponseBody setUsedCredits(String usedCredits) {
        this.usedCredits = usedCredits;
        return this;
    }
    public String getUsedCredits() {
        return this.usedCredits;
    }

    public GetUserCreditUsageResponseBody setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
