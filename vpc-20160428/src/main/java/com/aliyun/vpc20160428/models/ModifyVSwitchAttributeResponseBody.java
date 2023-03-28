// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVSwitchAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVSwitchAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVSwitchAttributeResponseBody self = new ModifyVSwitchAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVSwitchAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
