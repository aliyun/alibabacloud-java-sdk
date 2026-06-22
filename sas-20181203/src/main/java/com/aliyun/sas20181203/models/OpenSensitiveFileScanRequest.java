// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OpenSensitiveFileScanRequest extends TeaModel {
    /**
     * <p>The switch operation. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enable.</li>
     * <li><strong>off</strong>: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
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
