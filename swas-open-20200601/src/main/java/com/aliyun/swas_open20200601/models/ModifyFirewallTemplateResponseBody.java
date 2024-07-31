// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyFirewallTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyFirewallTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirewallTemplateResponseBody self = new ModifyFirewallTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFirewallTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
