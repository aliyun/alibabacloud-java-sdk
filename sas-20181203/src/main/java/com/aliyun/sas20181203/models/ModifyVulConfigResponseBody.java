// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>24DDBE06-58FF-5E5E-9241-D2010D7913C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVulConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulConfigResponseBody self = new ModifyVulConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVulConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
