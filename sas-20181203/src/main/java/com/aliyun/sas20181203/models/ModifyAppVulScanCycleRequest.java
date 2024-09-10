// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAppVulScanCycleRequest extends TeaModel {
    /**
     * <p>The scan cycle for application vulnerabilities.</p>
     * <ul>
     * <li>1week</li>
     * <li>2weeks</li>
     * <li>3days</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1week</p>
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
