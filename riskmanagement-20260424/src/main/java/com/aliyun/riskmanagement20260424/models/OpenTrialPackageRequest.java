// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class OpenTrialPackageRequest extends TeaModel {
    @NameInMap("AutoCloseSwitch")
    public Integer autoCloseSwitch;

    @NameInMap("RegionId")
    public String regionId;

    public static OpenTrialPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenTrialPackageRequest self = new OpenTrialPackageRequest();
        return TeaModel.build(map, self);
    }

    public OpenTrialPackageRequest setAutoCloseSwitch(Integer autoCloseSwitch) {
        this.autoCloseSwitch = autoCloseSwitch;
        return this;
    }
    public Integer getAutoCloseSwitch() {
        return this.autoCloseSwitch;
    }

    public OpenTrialPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
