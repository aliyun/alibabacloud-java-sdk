// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClientAlertModeRequest extends TeaModel {
    /**
     * <p>The protection mode. Valid values:</p>
     * <br>
     * <p>*   **strict**: The strict mode. False positives may be generated. We recommend that you enable this mode during major events.</p>
     * <p>*   **balance**: The balanced mode. More risks can be detected with less false positives in this mode.</p>
     */
    @NameInMap("Mode")
    public String mode;

    public static ListClientAlertModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClientAlertModeRequest self = new ListClientAlertModeRequest();
        return TeaModel.build(map, self);
    }

    public ListClientAlertModeRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
