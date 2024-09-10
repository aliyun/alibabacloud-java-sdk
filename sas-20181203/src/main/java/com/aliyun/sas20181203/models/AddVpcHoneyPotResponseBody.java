// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddVpcHoneyPotResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F3B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddVpcHoneyPotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVpcHoneyPotResponseBody self = new AddVpcHoneyPotResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVpcHoneyPotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
