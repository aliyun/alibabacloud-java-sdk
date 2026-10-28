// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StartupDependency extends TeaModel {
    /**
     * <p>The minimum number of dependent roles that must reach the expected phase to be considered satisfied.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinReplicas")
    public String minReplicas;

    /**
     * <p>The phase that dependent roles must reach to be considered satisfied.</p>
     * 
     * <strong>example:</strong>
     * <p>ServiceReady</p>
     */
    @NameInMap("OnPhase")
    public String onPhase;

    /**
     * <p>The type of the dependent role.</p>
     * 
     * <strong>example:</strong>
     * <p>Worker</p>
     */
    @NameInMap("Type")
    public String type;

    public static StartupDependency build(java.util.Map<String, ?> map) throws Exception {
        StartupDependency self = new StartupDependency();
        return TeaModel.build(map, self);
    }

    public StartupDependency setMinReplicas(String minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }
    public String getMinReplicas() {
        return this.minReplicas;
    }

    public StartupDependency setOnPhase(String onPhase) {
        this.onPhase = onPhase;
        return this;
    }
    public String getOnPhase() {
        return this.onPhase;
    }

    public StartupDependency setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
