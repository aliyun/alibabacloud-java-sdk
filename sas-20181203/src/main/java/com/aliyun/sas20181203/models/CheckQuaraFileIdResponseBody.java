// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckQuaraFileIdResponseBody extends TeaModel {
    // Indicates whether the ID of the quarantined file is valid. Valid values:
    // 
    // *   **true**: The ID of the quarantined file is valid.
    // *   **false**: The ID of the quarantined file is invalid.
    @NameInMap("Data")
    public Boolean data;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static CheckQuaraFileIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckQuaraFileIdResponseBody self = new CheckQuaraFileIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckQuaraFileIdResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CheckQuaraFileIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
