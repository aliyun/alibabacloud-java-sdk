// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAppLicenseRequest extends TeaModel {
    @NameInMap("AppItemId")
    public String appItemId;

    @NameInMap("LicenseItemIds")
    public String licenseItemIds;

    public static DeleteAppLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppLicenseRequest self = new DeleteAppLicenseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppLicenseRequest setAppItemId(String appItemId) {
        this.appItemId = appItemId;
        return this;
    }
    public String getAppItemId() {
        return this.appItemId;
    }

    public DeleteAppLicenseRequest setLicenseItemIds(String licenseItemIds) {
        this.licenseItemIds = licenseItemIds;
        return this;
    }
    public String getLicenseItemIds() {
        return this.licenseItemIds;
    }

}
