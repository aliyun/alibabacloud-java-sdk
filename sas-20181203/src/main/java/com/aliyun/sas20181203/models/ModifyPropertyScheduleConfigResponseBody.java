// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPropertyScheduleConfigResponseBody extends TeaModel {
    @NameInMap("ModifyResult")
    public Boolean modifyResult;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPropertyScheduleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPropertyScheduleConfigResponseBody self = new ModifyPropertyScheduleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPropertyScheduleConfigResponseBody setModifyResult(Boolean modifyResult) {
        this.modifyResult = modifyResult;
        return this;
    }
    public Boolean getModifyResult() {
        return this.modifyResult;
    }

    public ModifyPropertyScheduleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
