// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyTargetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0E147337-5B0B-5776-B0B6-D569DBA8F60F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyStrategyTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStrategyTargetResponseBody self = new ModifyStrategyTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStrategyTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
