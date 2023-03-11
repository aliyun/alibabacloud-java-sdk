// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetClusterInterceptionConfigRequest extends TeaModel {
    /**
     * <p>The ID of the cluster. Separate multiple cluster IDs with commas (,).</p>
     * <br>
     * <p>> You can call the [ListClusterInterceptionConfig](~~ListClusterInterceptionConfig~~) operation to query the IDs of clusters.</p>
     */
    @NameInMap("ClusterIds")
    public String clusterIds;

    /**
     * <p>Specifies whether to turn on the switch. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("SwitchOn")
    public Integer switchOn;

    /**
     * <p>The type of the switch that you want to configure. Valid values:</p>
     * <br>
     * <p>*   **0**: the interception switch</p>
     * <p>*   **1**: the interception type switch</p>
     * <p>*   **2**: the interception history switch</p>
     */
    @NameInMap("SwitchType")
    public Integer switchType;

    public static SetClusterInterceptionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetClusterInterceptionConfigRequest self = new SetClusterInterceptionConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetClusterInterceptionConfigRequest setClusterIds(String clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public String getClusterIds() {
        return this.clusterIds;
    }

    public SetClusterInterceptionConfigRequest setSwitchOn(Integer switchOn) {
        this.switchOn = switchOn;
        return this;
    }
    public Integer getSwitchOn() {
        return this.switchOn;
    }

    public SetClusterInterceptionConfigRequest setSwitchType(Integer switchType) {
        this.switchType = switchType;
        return this;
    }
    public Integer getSwitchType() {
        return this.switchType;
    }

}
