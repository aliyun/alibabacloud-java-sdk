// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetControlPolicyEnablementStatusResponseBody extends TeaModel {
    @NameInMap("EnablementStatus")
    public String enablementStatus;

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
