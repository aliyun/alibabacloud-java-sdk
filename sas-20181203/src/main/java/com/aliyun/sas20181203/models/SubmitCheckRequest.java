// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SubmitCheckRequest extends TeaModel {
    /**
     * <p>The check items that are scanned. Valid values:</p>
     * <br>
     * <p>*   **FULL**: All check items are scanned.</p>
     * <p>*   **FULL**: Only the check items that are configured are scanned.</p>
     */
    @NameInMap("ScanRange")
    public String scanRange;

    public static SubmitCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCheckRequest self = new SubmitCheckRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCheckRequest setScanRange(String scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public String getScanRange() {
        return this.scanRange;
    }

}
