// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyDingTalkStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81DCBD76-196C-57A5-9C7D-F14DE8E1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDingTalkStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDingTalkStatusResponseBody self = new ModifyDingTalkStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDingTalkStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
