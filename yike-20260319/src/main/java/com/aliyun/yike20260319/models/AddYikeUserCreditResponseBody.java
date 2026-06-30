// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class AddYikeUserCreditResponseBody extends TeaModel {
    /**
     * <p>The error code returned when the increase fails. Valid values:</p>
     * <ul>
     * <li>NOT_ENOUGH_ALLOCATE_CREDIT_QUOTA: The primary account does not have sufficient credit balance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NOT_ENOUGH_ALLOCATE_CREDIT_QUOTA</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the credits were increased successfully.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static AddYikeUserCreditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddYikeUserCreditResponseBody self = new AddYikeUserCreditResponseBody();
        return TeaModel.build(map, self);
    }

    public AddYikeUserCreditResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddYikeUserCreditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddYikeUserCreditResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
