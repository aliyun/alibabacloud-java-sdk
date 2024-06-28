// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatIpCidrAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNatIpCidrAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatIpCidrAttributeResponseBody self = new ModifyNatIpCidrAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNatIpCidrAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
