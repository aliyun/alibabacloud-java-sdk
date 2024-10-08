// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulWhitelistTargetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>896AC4F0-C881-502B-BFC7-4751C5E3DEAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVulWhitelistTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulWhitelistTargetResponseBody self = new ModifyVulWhitelistTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVulWhitelistTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
