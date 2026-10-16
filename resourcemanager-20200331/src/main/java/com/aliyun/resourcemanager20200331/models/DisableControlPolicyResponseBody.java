// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DisableControlPolicyResponseBody extends TeaModel {
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
     * <p>PendingDisable</p>
     */
    @NameInMap("EnablementStatus")
    public String enablementStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7C709979-451D-4C92-835D-7DDCCAA562E9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableControlPolicyResponseBody self = new DisableControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableControlPolicyResponseBody setEnablementStatus(String enablementStatus) {
        this.enablementStatus = enablementStatus;
        return this;
    }
    public String getEnablementStatus() {
        return this.enablementStatus;
    }

    public DisableControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
