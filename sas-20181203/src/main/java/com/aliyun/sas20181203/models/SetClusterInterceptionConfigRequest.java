// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetClusterInterceptionConfigRequest extends TeaModel {
    @NameInMap("ClusterIds")
    public String clusterIds;

    @NameInMap("SwitchOn")
    public Integer switchOn;

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
