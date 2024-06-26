// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBDescriptionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5F295AAB-B599-4F0E-96D0-DBFAB3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBDescriptionResponseBody self = new ModifyDBDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
