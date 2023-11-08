// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpgradeDetailGatewayStatusRecordValue extends TeaModel {
    /**
     * <p>The upgrade status of the ingress gateway. Valid values:</p>
     * <br>
     * <p>*   `upgrading`: The ingress gateway is being upgraded.</p>
     * <p>*   `pending`: The ingress gateway waits to be upgraded.</p>
     * <p>*   `finished`: The ingress gateway upgrade is complete.</p>
     * <p>*   `notStart`: The ingress gateway upgrade does not start.</p>
     * <p>*   `failed`: The ingress gateway upgrade fails.</p>
     * <p>*   `unknown`: The upgrade status of the ingress gateway is unknown.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Additional status information of the ingress gateway.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The version of the ingress gateway.</p>
     */
    @NameInMap("Version")
    public String version;

    public static UpgradeDetailGatewayStatusRecordValue build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDetailGatewayStatusRecordValue self = new UpgradeDetailGatewayStatusRecordValue();
        return TeaModel.build(map, self);
    }

    public UpgradeDetailGatewayStatusRecordValue setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpgradeDetailGatewayStatusRecordValue setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeDetailGatewayStatusRecordValue setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
