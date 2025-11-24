// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyApiServerEipResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApiServerEipResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiServerEipResourceResponseBody self = new ModifyApiServerEipResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApiServerEipResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
