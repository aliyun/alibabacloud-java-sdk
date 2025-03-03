// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetControlPolicyEnablementStatusResponseBody extends TeaModel {
    /**
     * <p>The status of the Control Policy feature. Valid values:</p>
     * <ul>
     * <li>Enabled: The Control Policy feature is enabled.</li>
     * <li>PendingEnable: The Control Policy feature is being enabled.</li>
     * <li>Disabled: The Control Policy feature is disabled.</li>
     * <li>PendingDisable: The Control Policy feature is being disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("EnablementStatus")
    public String enablementStatus;

    /**
     * <p>The ID of the request.</p>
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
