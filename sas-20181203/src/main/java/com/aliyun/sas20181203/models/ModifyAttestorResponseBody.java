// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAttestorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9E8B1D8F-DE1C-5421-81AA-**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAttestorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAttestorResponseBody self = new ModifyAttestorResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAttestorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
