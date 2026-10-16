// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class EnableControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The status of the control policy feature. Valid values:</p>
     * <ul>
     * <li>Enabled: Enabled.</li>
     * <li>PendingEnable: Being enabled.</li>
     * <li>Disabled: Disabled.</li>
     * <li>PendingDisable: Being disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PendingEnable</p>
     */
    @NameInMap("EnablementStatus")
    public String enablementStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8CE7BD95-EFFA-4911-A1E0-BD4412697FEB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableControlPolicyResponseBody self = new EnableControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableControlPolicyResponseBody setEnablementStatus(String enablementStatus) {
        this.enablementStatus = enablementStatus;
        return this;
    }
    public String getEnablementStatus() {
        return this.enablementStatus;
    }

    public EnableControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
