// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DisableControlPolicyResponseBody extends TeaModel {
    @NameInMap("EnablementStatus")
    public String enablementStatus;

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
