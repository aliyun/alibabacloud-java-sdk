// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class OpenTrialPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically disable the trial plan when it expires.</p>
     * <ul>
     * <li><strong>1</strong>: Enabled.</li>
     * <li><strong>0</strong>: Disabled.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AutoCloseSwitch")
    public Integer autoCloseSwitch;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-guangzhou</p>
     */
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
