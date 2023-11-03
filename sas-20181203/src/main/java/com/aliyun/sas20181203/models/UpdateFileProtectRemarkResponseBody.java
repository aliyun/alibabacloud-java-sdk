// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectRemarkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFileProtectRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectRemarkResponseBody self = new UpdateFileProtectRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
