// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchOverMajorVersionUpgradeResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>17F57FEE-EA4F-4337-8D2E-9C23CAA63D74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchOverMajorVersionUpgradeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchOverMajorVersionUpgradeResponseBody self = new SwitchOverMajorVersionUpgradeResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchOverMajorVersionUpgradeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
