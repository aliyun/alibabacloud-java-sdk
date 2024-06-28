// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBgpPeerAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D4B7649A-61BB-4C64-A586-1DFF1EDA6A42</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBgpPeerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBgpPeerAttributeResponseBody self = new ModifyBgpPeerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBgpPeerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
