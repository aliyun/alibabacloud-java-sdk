// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceDeploySchemeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ADF42B18-43FD-5100-83A9-BE81AB70C863</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeDBInstanceDeploySchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceDeploySchemeResponseBody self = new UpgradeDBInstanceDeploySchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceDeploySchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
