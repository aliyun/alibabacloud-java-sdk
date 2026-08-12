// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class InitSasModuleRuleShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic binding. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <p>The list of instances.</p>
     */
    @NameInMap("Instances")
    public String instancesShrink;

    /**
     * <p>Specifies whether to use the trial version.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsTrial")
    public Boolean isTrial;

    /**
     * <p>The region ID of the access control instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-guangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static InitSasModuleRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InitSasModuleRuleShrinkRequest self = new InitSasModuleRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InitSasModuleRuleShrinkRequest setAutoBind(Integer autoBind) {
        this.autoBind = autoBind;
        return this;
    }
    public Integer getAutoBind() {
        return this.autoBind;
    }

    public InitSasModuleRuleShrinkRequest setInstancesShrink(String instancesShrink) {
        this.instancesShrink = instancesShrink;
        return this;
    }
    public String getInstancesShrink() {
        return this.instancesShrink;
    }

    public InitSasModuleRuleShrinkRequest setIsTrial(Boolean isTrial) {
        this.isTrial = isTrial;
        return this;
    }
    public Boolean getIsTrial() {
        return this.isTrial;
    }

    public InitSasModuleRuleShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
