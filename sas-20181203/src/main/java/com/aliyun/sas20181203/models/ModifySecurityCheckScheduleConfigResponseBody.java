// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySecurityCheckScheduleConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>02287C0D-8DA9-5766-B51A-A63192BD3E80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySecurityCheckScheduleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityCheckScheduleConfigResponseBody self = new ModifySecurityCheckScheduleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityCheckScheduleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
