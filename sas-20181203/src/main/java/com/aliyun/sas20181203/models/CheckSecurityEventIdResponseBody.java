// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckSecurityEventIdResponseBody extends TeaModel {
    // Indicates whether the alert events are generated on the server. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("Data")
    public Boolean data;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static CheckSecurityEventIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSecurityEventIdResponseBody self = new CheckSecurityEventIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSecurityEventIdResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CheckSecurityEventIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
