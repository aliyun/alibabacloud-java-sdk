// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInspectionScheduleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AD7E16AA-6B23-43BF-979C-07D957FB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInspectionScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInspectionScheduleResponseBody self = new ModifyInspectionScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInspectionScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
