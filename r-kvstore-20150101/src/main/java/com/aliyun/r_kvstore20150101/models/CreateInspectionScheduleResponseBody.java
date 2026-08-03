// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInspectionScheduleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>561AFBF1-BE20-44DB-9BD1-6988B53E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInspectionScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInspectionScheduleResponseBody self = new CreateInspectionScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInspectionScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
