// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyApiServerEipResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
