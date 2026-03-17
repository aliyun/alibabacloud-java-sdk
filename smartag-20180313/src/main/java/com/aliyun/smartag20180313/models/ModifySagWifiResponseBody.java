// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagWifiResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1120228A-E5E1-4E9C-B56D-96887E1A2B2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagWifiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagWifiResponseBody self = new ModifySagWifiResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagWifiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
