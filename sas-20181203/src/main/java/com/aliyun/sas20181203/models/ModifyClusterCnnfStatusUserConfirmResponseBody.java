// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClusterCnnfStatusUserConfirmResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4FFBEDBD-FA63-5213-9103-306519EE4857</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterCnnfStatusUserConfirmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterCnnfStatusUserConfirmResponseBody self = new ModifyClusterCnnfStatusUserConfirmResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterCnnfStatusUserConfirmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
