// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAccessKeyLeakDealResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>DD4617B4-133A-53C8-ADAE-7B30FF89****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccessKeyLeakDealResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessKeyLeakDealResponseBody self = new ModifyAccessKeyLeakDealResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccessKeyLeakDealResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
