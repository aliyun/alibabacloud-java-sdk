// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpgradeDetailGatewayStatusRecordValue extends TeaModel {
    /**
     * <p>The upgrade status of the ingress gateway. Valid values:</p>
     * <ul>
     * <li><code>upgrading</code>: The ingress gateway is being upgraded.</li>
     * <li><code>pending</code>: The ingress gateway waits to be upgraded.</li>
     * <li><code>finished</code>: The ingress gateway upgrade is complete.</li>
     * <li><code>notStart</code>: The ingress gateway upgrade does not start.</li>
     * <li><code>failed</code>: The ingress gateway upgrade fails.</li>
     * <li><code>unknown</code>: The upgrade status of the ingress gateway is unknown.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>upgrading</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Additional status information of the ingress gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The version of the ingress gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>1.9.7</p>
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
