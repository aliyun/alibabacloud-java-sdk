// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectEventStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C286491D-4A2F-589A-B63B-D2AD3DA9BD71</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFileProtectEventStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectEventStatusResponseBody self = new UpdateFileProtectEventStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectEventStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
