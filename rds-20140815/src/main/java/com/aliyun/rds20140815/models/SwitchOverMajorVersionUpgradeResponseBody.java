// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchOverMajorVersionUpgradeResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
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
