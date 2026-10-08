// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RemoveRCInstancesFromDeploymentSetRequest extends TeaModel {
    /**
     * <p>The deployment set ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-uf6c8qerk019bj1l****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-sff,rc-err</p>
     */
    @NameInMap("RCInstanceIds")
    public String RCInstanceIds;

    /**
     * <p>The region ID. You can call DescribeRegions to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RemoveRCInstancesFromDeploymentSetRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveRCInstancesFromDeploymentSetRequest self = new RemoveRCInstancesFromDeploymentSetRequest();
        return TeaModel.build(map, self);
    }

    public RemoveRCInstancesFromDeploymentSetRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public RemoveRCInstancesFromDeploymentSetRequest setRCInstanceIds(String RCInstanceIds) {
        this.RCInstanceIds = RCInstanceIds;
        return this;
    }
    public String getRCInstanceIds() {
        return this.RCInstanceIds;
    }

    public RemoveRCInstancesFromDeploymentSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
