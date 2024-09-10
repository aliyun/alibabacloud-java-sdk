// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVpcHoneyPotResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8158FE9E-19BE-42D6-9F7A-9BE34A2DE1D5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcHoneyPotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcHoneyPotResponseBody self = new ModifyVpcHoneyPotResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcHoneyPotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
