// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyParameterTimedScheduleTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6EF82B07-28D2-48D1-B5D6-7E78FED277C7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyParameterTimedScheduleTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterTimedScheduleTaskResponseBody self = new ModifyParameterTimedScheduleTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyParameterTimedScheduleTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
