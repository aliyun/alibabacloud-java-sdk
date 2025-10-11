// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyScheduleTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E56531A4-E552-40BA-9C58-137B80******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyScheduleTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduleTaskResponseBody self = new ModifyScheduleTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScheduleTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyScheduleTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
