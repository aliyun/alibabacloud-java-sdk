// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulTargetConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1FF908BA-ADD8-5138-8595-614C6E3C6658</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVulTargetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulTargetConfigResponseBody self = new ModifyVulTargetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVulTargetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
