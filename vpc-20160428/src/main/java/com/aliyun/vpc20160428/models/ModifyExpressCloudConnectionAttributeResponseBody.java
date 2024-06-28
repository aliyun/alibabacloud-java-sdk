// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressCloudConnectionAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E6385514-B0CC-48E3-B9F9-F7BFF64460A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyExpressCloudConnectionAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressCloudConnectionAttributeResponseBody self = new ModifyExpressCloudConnectionAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyExpressCloudConnectionAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
