// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetControlPolicyEnablementStatusResponseBody extends TeaModel {
    /**
     * <p>The status of the Control Policy feature. Valid values:</p>
     * <br>
     * <p>*   Enabled: The feature is enabled.</p>
     * <p>*   PendingEnable: The feature is being enabled.</p>
     * <p>*   Disabled: The feature is disabled.</p>
     * <p>*   PendingDisable: The feature is being disabled.</p>
     */
    @NameInMap("EnablementStatus")
    public String enablementStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetControlPolicyEnablementStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetControlPolicyEnablementStatusResponseBody self = new GetControlPolicyEnablementStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetControlPolicyEnablementStatusResponseBody setEnablementStatus(String enablementStatus) {
        this.enablementStatus = enablementStatus;
        return this;
    }
    public String getEnablementStatus() {
        return this.enablementStatus;
    }

    public GetControlPolicyEnablementStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
