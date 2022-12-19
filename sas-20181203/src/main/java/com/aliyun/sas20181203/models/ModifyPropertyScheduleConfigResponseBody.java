// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPropertyScheduleConfigResponseBody extends TeaModel {
    // Indicates whether the collection frequency of asset fingerprints is modified. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("ModifyResult")
    public Boolean modifyResult;

    // The ID of the request, which is used to locate and troubleshoot issues.
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
