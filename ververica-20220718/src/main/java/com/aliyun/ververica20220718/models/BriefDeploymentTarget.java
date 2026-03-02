// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class BriefDeploymentTarget extends TeaModel {
    /**
     * <p>The deployment mode.</p>
     * 
     * <strong>example:</strong>
     * <p>PER_JOB</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The name of the queue used for the deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>vvp-workload</p>
     */
    @NameInMap("name")
    public String name;

    public static BriefDeploymentTarget build(java.util.Map<String, ?> map) throws Exception {
        BriefDeploymentTarget self = new BriefDeploymentTarget();
        return TeaModel.build(map, self);
    }

    public BriefDeploymentTarget setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public BriefDeploymentTarget setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
