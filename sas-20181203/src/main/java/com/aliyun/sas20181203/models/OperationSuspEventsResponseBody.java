// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationSuspEventsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether you have access permissions. Valid values:</p>
     * <br>
     * <p>*   **pass**: yes</p>
     * <p>*   **no_permission**: no</p>
     */
    @NameInMap("AccessCode")
    public String accessCode;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether exceptions are handled. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
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
