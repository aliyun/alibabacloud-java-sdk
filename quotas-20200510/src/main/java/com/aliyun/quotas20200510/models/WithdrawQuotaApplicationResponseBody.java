// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class WithdrawQuotaApplicationResponseBody extends TeaModel {
    /**
     * <p>The ID of the quota application.</p>
     * 
     * <strong>example:</strong>
     * <p>d314d6ae-867d-484c-9009-3d421a80****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FF8CAF0-29D9-4F11-B6A4-FD2CBCA016D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static WithdrawQuotaApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WithdrawQuotaApplicationResponseBody self = new WithdrawQuotaApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public WithdrawQuotaApplicationResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public WithdrawQuotaApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WithdrawQuotaApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
