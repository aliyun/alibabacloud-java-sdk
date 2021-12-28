// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpgradeDetailGatewayStatusRecordValue extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Message")
    public String message;

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
