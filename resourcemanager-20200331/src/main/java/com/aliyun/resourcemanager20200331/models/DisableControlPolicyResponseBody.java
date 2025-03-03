// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DisableControlPolicyResponseBody extends TeaModel {
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
     * <p>PendingDisable</p>
     */
    @NameInMap("EnablementStatus")
    public String enablementStatus;

    /**
     * <p>The ID of the request.</p>
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
