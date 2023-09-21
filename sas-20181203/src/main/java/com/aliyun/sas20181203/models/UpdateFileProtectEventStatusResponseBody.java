// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectEventStatusResponseBody extends TeaModel {
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
