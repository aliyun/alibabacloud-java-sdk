// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AddRCInstancesToDeploymentSetRequest extends TeaModel {
    /**
     * <p>The group number of the instance in the deployment set. This parameter is valid only when the deployment set strategy of the ECS instance to be added or adjusted is AvailabilityGroup. Valid values: 1 to 7.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DeploymentSetGroupNo")
    public String deploymentSetGroupNo;

    /**
     * <p>The ID of the deployment set.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-uf6c8qerk019bj1l****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>Specifies whether to forcibly release the running instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong> (default): no.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-aaaa,rc-bbb</p>
     */
    @NameInMap("RCInstanceIds")
    public String RCInstanceIds;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddRCInstancesToDeploymentSetRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRCInstancesToDeploymentSetRequest self = new AddRCInstancesToDeploymentSetRequest();
        return TeaModel.build(map, self);
    }

    public AddRCInstancesToDeploymentSetRequest setDeploymentSetGroupNo(String deploymentSetGroupNo) {
        this.deploymentSetGroupNo = deploymentSetGroupNo;
        return this;
    }
    public String getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    public AddRCInstancesToDeploymentSetRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public AddRCInstancesToDeploymentSetRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public AddRCInstancesToDeploymentSetRequest setRCInstanceIds(String RCInstanceIds) {
        this.RCInstanceIds = RCInstanceIds;
        return this;
    }
    public String getRCInstanceIds() {
        return this.RCInstanceIds;
    }

    public AddRCInstancesToDeploymentSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
