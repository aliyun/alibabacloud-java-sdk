// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateSyncEcsHostTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateSyncEcsHostTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSyncEcsHostTaskResponseBody self = new UpdateSyncEcsHostTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSyncEcsHostTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSyncEcsHostTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
