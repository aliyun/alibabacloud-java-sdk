// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class InitSasModuleRuleShrinkRequest extends TeaModel {
    @NameInMap("AutoBind")
    public Integer autoBind;

    @NameInMap("Instances")
    public String instancesShrink;

    @NameInMap("IsTrial")
    public Boolean isTrial;

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
