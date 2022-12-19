// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationSuspEventsResponseBody extends TeaModel {
    // Indicates whether you have access permissions. Valid values:
    // 
    // *   **pass**: yes
    // *   **no_permission**: no
    @NameInMap("AccessCode")
    public String accessCode;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether exceptions are handled. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("Success")
    public Boolean success;

    public static OperationSuspEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperationSuspEventsResponseBody self = new OperationSuspEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public OperationSuspEventsResponseBody setAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }
    public String getAccessCode() {
        return this.accessCode;
    }

    public OperationSuspEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OperationSuspEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
