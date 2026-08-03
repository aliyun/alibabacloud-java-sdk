// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteInspectionScheduleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5D622714-AEDD-4609-9167-F5DDD3D1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInspectionScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInspectionScheduleResponseBody self = new DeleteInspectionScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInspectionScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
