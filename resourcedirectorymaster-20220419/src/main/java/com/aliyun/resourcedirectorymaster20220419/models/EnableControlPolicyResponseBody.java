// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class EnableControlPolicyResponseBody extends TeaModel {
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
