// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetClusterInterceptionConfigRequest extends TeaModel {
    /**
     * <p>The ID of the cluster. Separate multiple cluster IDs with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListClusterInterceptionConfig~~">ListClusterInterceptionConfig</a> operation to query the IDs of clusters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c60b77fe62093480db6164a3c2fa****</p>
     */
    @NameInMap("ClusterIds")
    public String clusterIds;

    /**
     * <p>Specifies whether to turn on the switch. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SwitchOn")
    public Integer switchOn;

    /**
     * <p>The type of the switch that you want to configure. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the interception switch</li>
     * <li><strong>1</strong>: the interception type switch</li>
     * <li><strong>2</strong>: the interception history switch</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
