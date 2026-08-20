// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetUserCreditUsageResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The credit limit of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("creditLimit")
    public String creditLimit;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The remaining credits in real time.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("remainingCredits")
    public String remainingCredits;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The shadow credit limit.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("shadowCreditLimit")
    public String shadowCreditLimit;

    /**
     * <p>The remaining shadow credits in real time.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("shadowRemainingCredits")
    public String shadowRemainingCredits;

    /**
     * <p>The consumed shadow credits in real time.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("shadowUsedCredits")
    public String shadowUsedCredits;

    /**
     * <p>The ID of the tenant to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public Long tenantId;

    /**
     * <p>The consumed credits in real time.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("usedCredits")
    public String usedCredits;

    /**
     * <p>The user ID.</p>
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
