// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPropertyScheduleConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ModifyResult")
    public Boolean modifyResult;

    /**
     * <strong>example:</strong>
     * <p>C0D1DF51-D879-55A8-B6C7-7D3B913EF34D</p>
     */
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
