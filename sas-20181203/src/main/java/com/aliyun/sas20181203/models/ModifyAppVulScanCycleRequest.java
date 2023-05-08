// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAppVulScanCycleRequest extends TeaModel {
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
