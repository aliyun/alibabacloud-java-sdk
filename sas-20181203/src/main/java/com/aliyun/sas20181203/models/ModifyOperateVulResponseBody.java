// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOperateVulResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>DFE4F166-1AC9-4FAC-A4E4-F0608AD705A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOperateVulResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOperateVulResponseBody self = new ModifyOperateVulResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOperateVulResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
