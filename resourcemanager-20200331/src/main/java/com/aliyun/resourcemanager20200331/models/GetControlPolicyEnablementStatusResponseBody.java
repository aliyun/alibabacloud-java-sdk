// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetControlPolicyEnablementStatusResponseBody extends TeaModel {
    /**
     * <p>The status of the control policy feature. Valid values:</p>
     * <ul>
     * <li>Enabled: The control policy feature is enabled.</li>
     * <li>PendingEnable: The control policy feature is being enabled.</li>
     * <li>Disabled: The control policy feature is disabled.</li>
     * <li>PendingDisable: The control policy feature is being disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("EnablementStatus")
    public String enablementStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1DC39A4E-3B52-4EFE-9F93-4897D7FFA0C4</p>
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
