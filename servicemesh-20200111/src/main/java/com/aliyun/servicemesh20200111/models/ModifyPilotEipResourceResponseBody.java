// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyPilotEipResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPilotEipResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPilotEipResourceResponseBody self = new ModifyPilotEipResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPilotEipResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
