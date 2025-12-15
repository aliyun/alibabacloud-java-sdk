// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class EnableResourceGroupNotificationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7701451-340B-5CB3-AEA7-7D831F7F38C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableResourceGroupNotificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableResourceGroupNotificationResponseBody self = new EnableResourceGroupNotificationResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableResourceGroupNotificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
