// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAppVulScanCycleRequest extends TeaModel {
    /**
     * <p>The scan cycle for application vulnerabilities.</p>
     * <br>
     * <p>*   1week</p>
     * <p>*   2weeks</p>
     * <p>*   3days</p>
     */
    @NameInMap("Cycle")
    public String cycle;

    public static ModifyAppVulScanCycleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppVulScanCycleRequest self = new ModifyAppVulScanCycleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppVulScanCycleRequest setCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }
    public String getCycle() {
        return this.cycle;
    }

}
