// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyFullNatEntryAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2315DEB7-5E92-423A-91F7-4C1EC9AD97C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyFullNatEntryAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFullNatEntryAttributeResponseBody self = new ModifyFullNatEntryAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFullNatEntryAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
