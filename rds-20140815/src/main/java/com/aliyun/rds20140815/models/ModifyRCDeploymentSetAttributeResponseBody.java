// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCDeploymentSetAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B61C08E5-403A-46A2-96C1-F7B1216DB10C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCDeploymentSetAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCDeploymentSetAttributeResponseBody self = new ModifyRCDeploymentSetAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCDeploymentSetAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
