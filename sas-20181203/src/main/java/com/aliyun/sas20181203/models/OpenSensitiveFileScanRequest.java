// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OpenSensitiveFileScanRequest extends TeaModel {
    // Specifies whether to enable or disable sensitive file scan. Valid values:
    // 
    // *   **on**: enables sensitive file scan
    // *   **off**: disables sensitive file scan
    @NameInMap("SwitchOn")
    public String switchOn;

    public static OpenSensitiveFileScanRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenSensitiveFileScanRequest self = new OpenSensitiveFileScanRequest();
        return TeaModel.build(map, self);
    }

    public OpenSensitiveFileScanRequest setSwitchOn(String switchOn) {
        this.switchOn = switchOn;
        return this;
    }
    public String getSwitchOn() {
        return this.switchOn;
    }

}
