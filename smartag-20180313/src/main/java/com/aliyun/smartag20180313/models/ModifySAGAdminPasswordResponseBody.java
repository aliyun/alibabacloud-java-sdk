// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySAGAdminPasswordResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DB0A026C-A8E5-40AB-977E-3A87DD78F694</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySAGAdminPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySAGAdminPasswordResponseBody self = new ModifySAGAdminPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySAGAdminPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
