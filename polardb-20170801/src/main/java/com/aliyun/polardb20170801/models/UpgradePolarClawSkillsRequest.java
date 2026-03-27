// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradePolarClawSkillsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>polarclaw</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UpgradeMethod")
    public String upgradeMethod;

    public static UpgradePolarClawSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradePolarClawSkillsRequest self = new UpgradePolarClawSkillsRequest();
        return TeaModel.build(map, self);
    }

    public UpgradePolarClawSkillsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpgradePolarClawSkillsRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public UpgradePolarClawSkillsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradePolarClawSkillsRequest setUpgradeMethod(String upgradeMethod) {
        this.upgradeMethod = upgradeMethod;
        return this;
    }
    public String getUpgradeMethod() {
        return this.upgradeMethod;
    }

}
