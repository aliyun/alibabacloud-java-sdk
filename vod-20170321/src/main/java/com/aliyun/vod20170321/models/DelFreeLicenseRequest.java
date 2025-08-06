// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DelFreeLicenseRequest extends TeaModel {
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

    public static DelFreeLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        DelFreeLicenseRequest self = new DelFreeLicenseRequest();
        return TeaModel.build(map, self);
    }

    public DelFreeLicenseRequest setAppItemId(String appItemId) {
        this.appItemId = appItemId;
        return this;
    }
    public String getAppItemId() {
        return this.appItemId;
    }

    public DelFreeLicenseRequest setLicenseItemId(String licenseItemId) {
        this.licenseItemId = licenseItemId;
        return this;
    }
    public String getLicenseItemId() {
        return this.licenseItemId;
    }

}
