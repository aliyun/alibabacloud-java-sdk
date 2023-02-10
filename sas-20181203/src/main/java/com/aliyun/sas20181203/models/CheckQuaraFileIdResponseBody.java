// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckQuaraFileIdResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the ID of the quarantined file is valid. Valid values:</p>
     * <br>
     * <p>*   **true**: The ID of the quarantined file is valid.</p>
     * <p>*   **false**: The ID of the quarantined file is invalid.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
