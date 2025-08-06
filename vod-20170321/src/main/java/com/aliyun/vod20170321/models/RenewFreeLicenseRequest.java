// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RenewFreeLicenseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppItemId")
    public String appItemId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LicenseItemId")
    public String licenseItemId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ValidPeriod")
    public Integer validPeriod;

    public static RenewFreeLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewFreeLicenseRequest self = new RenewFreeLicenseRequest();
        return TeaModel.build(map, self);
    }

    public RenewFreeLicenseRequest setAppItemId(String appItemId) {
        this.appItemId = appItemId;
        return this;
    }
    public String getAppItemId() {
        return this.appItemId;
    }

    public RenewFreeLicenseRequest setLicenseItemId(String licenseItemId) {
        this.licenseItemId = licenseItemId;
        return this;
    }
    public String getLicenseItemId() {
        return this.licenseItemId;
    }

    public RenewFreeLicenseRequest setValidPeriod(Integer validPeriod) {
        this.validPeriod = validPeriod;
        return this;
    }
    public Integer getValidPeriod() {
        return this.validPeriod;
    }

}
