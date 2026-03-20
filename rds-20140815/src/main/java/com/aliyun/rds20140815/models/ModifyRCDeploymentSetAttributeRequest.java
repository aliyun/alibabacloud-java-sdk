// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCDeploymentSetAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-bp1frxuzdg87zh4p****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <strong>example:</strong>
     * <p>DeploymentSetTestName</p>
     */
    @NameInMap("DeploymentSetName")
    public String deploymentSetName;

    /**
     * <strong>example:</strong>
     * <p>TestDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyRCDeploymentSetAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCDeploymentSetAttributeRequest self = new ModifyRCDeploymentSetAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCDeploymentSetAttributeRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public ModifyRCDeploymentSetAttributeRequest setDeploymentSetName(String deploymentSetName) {
        this.deploymentSetName = deploymentSetName;
        return this;
    }
    public String getDeploymentSetName() {
        return this.deploymentSetName;
    }

    public ModifyRCDeploymentSetAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyRCDeploymentSetAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
